package com.singular.sdk.internal;

import android.app.Application;
import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
class SessionManager {
    private static final SingularLog logger = SingularLog.getLogger("Session");
    private final SingularInstance singular;
    private boolean usingForegroundTracking = false;
    private long sessionId = -1;
    private long lastSessionPauseTime = -1;
    private long sequence = 0;
    private boolean inForeground = true;

    private void enableForegroundTracking(Application application) {
        if (this.usingForegroundTracking) {
            return;
        }
        if (Utils.getWrapperName() == null || !Utils.getWrapperName().equalsIgnoreCase("mParticle")) {
            try {
                application.registerActivityLifecycleCallbacks(new SingularLifecycleCallbacks(this));
                this.usingForegroundTracking = true;
                logger.debug("ActivityLifecycleCallbacks registration successful, Automatic session management will work.");
            } catch (Throwable th) {
                logger.error("ActivityLifecycleCallbacks registration failed, Automatic session management will not work", th);
            }
        }
    }

    private boolean inSession() {
        return this.sessionId > 0;
    }

    private boolean isWithinMinTimeBetweenSessions(long j) {
        return j - this.lastSessionPauseTime < this.singular.getSingularConfig().sessionTimeoutSec * 1000;
    }

    private void load() {
        SingularDataStore singularDataStore = SingularDataStore.get(this.singular.getContext(), Constants.PREF_SESSION);
        this.sessionId = singularDataStore.getLong("id", -1L);
        this.lastSessionPauseTime = singularDataStore.getLong("lastSessionPauseTime", Utils.getCurrentTimeMillis());
        this.sequence = singularDataStore.getLong("seq", 0L);
        logger.debug("load() <= %s", toString());
    }

    private void persist() {
        try {
            SingularDataStore singularDataStore = SingularDataStore.get(this.singular.getContext(), Constants.PREF_SESSION);
            singularDataStore.putLong("id", this.sessionId);
            singularDataStore.putLong("lastSessionPauseTime", this.lastSessionPauseTime);
            singularDataStore.putLong("seq", this.sequence);
        } catch (Throwable th) {
            logger.error(Utils.formatException(th));
        }
    }

    private void resetSequence() {
        this.sequence = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastSessionPauseTime(long j) {
        this.lastSessionPauseTime = j;
        persist();
    }

    private void setSessionId(long j) {
        this.sessionId = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean startNewSessionIfNeeded(long j) {
        if (this.singular == null) {
            logger.debug("can't start new session - singular instance is null");
            return false;
        }
        if (SLPushNotificationsManager.getInstance().tryHandlePushNotificationAtPaths(this.singular.getSingularConfig().pushNotificationPayload, this.singular.getSingularConfig().pushNotificationLinkPath).booleanValue()) {
            logger.debug("app is opened with push link");
            SLPushNotificationsManager.getInstance().appOpenedWithPushNotification();
            startNewSession(j);
            return true;
        }
        if (this.singular.getSingularConfig().singularLink != null) {
            logger.debug("app is opened with deeplink.so starting new session");
            startNewSession(j);
            return true;
        }
        DeviceIDManager.getInstance().loadPreviousSdidForComparison(this.singular.getContext());
        if (DeviceIDManager.getInstance().isCurrentSdidNewComparedToPrevious(this.singular.getContext())) {
            logger.debug("starting new session because current sdid is fresh");
            startNewSession(j);
            return true;
        }
        if (inSession() && isWithinMinTimeBetweenSessions(j)) {
            logger.debug("session is not expired yet");
            return false;
        }
        logger.debug("session is expired. starting new session");
        startNewSession(j);
        return true;
    }

    public long getNextSequenceNumber() {
        long j = this.sequence + 1;
        this.sequence = j;
        return j;
    }

    public long getSessionId() {
        return this.sessionId;
    }

    public void onEnterForeground(final long j) {
        logger.debug("onEnterForeground() At %d", Long.valueOf(j));
        final Boolean boolValueOf = Boolean.valueOf((Utils.isOpenedWithDeeplink() || SLPushNotificationsManager.getInstance().didAppOpenWithPushNotification().booleanValue()) ? false : true);
        this.singular.runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SessionManager.2
            @Override // java.lang.Runnable
            public void run() {
                if (boolValueOf.booleanValue()) {
                    SessionManager.this.startNewSessionIfNeeded(j);
                }
                SessionManager.this.inForeground = true;
                if (SessionManager.this.inForeground || !SessionManager.this.usingForegroundTracking) {
                    NetworkMonitor.registerNetworkChangeListener(SessionManager.this.singular.getContext(), SessionManager.this.singular.getApiManager());
                }
                if (SessionManager.this.singular.getApiManager() != null) {
                    SessionManager.this.singular.getApiManager().wakeUp();
                }
            }
        });
    }

    public void onExitForeground(final long j) {
        logger.debug("onExitForeground() At %d", Long.valueOf(j));
        SLPushNotificationsManager.getInstance().appMovedToBackground();
        this.singular.runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SessionManager.1
            @Override // java.lang.Runnable
            public void run() {
                SessionManager.this.setLastSessionPauseTime(j);
                SessionManager.this.inForeground = false;
                BatchManager.getInstance().sendEvents();
                NetworkMonitor.unregisterNetworkChangeListener(SessionManager.this.singular.getContext());
                Utils.appMovedToBackground();
            }
        });
    }

    public void startNewSession(long j) {
        logger.debug("startNewSession() At %d", Long.valueOf(j));
        setSessionId(j);
        resetSequence();
        sendSessionStartEvent();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{id=");
        sb.append(this.sessionId);
        sb.append(", lastSessionPauseTime=");
        sb.append(this.lastSessionPauseTime);
        sb.append(", seq=");
        return n30.o(sb, this.sequence, '}');
    }

    public SessionManager(SingularInstance singularInstance) {
        this.singular = singularInstance;
        load();
        startNewSessionIfNeeded(Utils.getCurrentTimeMillis());
        enableForegroundTracking((Application) singularInstance.getContext());
        if (!this.inForeground && this.usingForegroundTracking) {
            return;
        }
        NetworkMonitor.registerNetworkChangeListener(singularInstance.getContext(), singularInstance.getApiManager());
    }

    private void sendSessionStartEvent() {
        if (!inSession()) {
            return;
        }
        this.singular.logSessionStart(this.sessionId);
    }
}
