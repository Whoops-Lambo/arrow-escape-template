package io.p071bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import defpackage.du;
import defpackage.mc3;
import io.p071bidmachine.core.a;
import io.p071bidmachine.core.j;
import io.p071bidmachine.internal.o;
import io.p071bidmachine.internal.q;
import io.p071bidmachine.internal.r;
import io.p071bidmachine.media3.common.audio.c;
import io.p071bidmachine.util.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class SessionManager {

    @NonNull
    public static final String SESSION_ID_EMPTY = "";

    @NonNull
    private static final String TAG = "SessionManager";

    @Nullable
    private static volatile SessionManager instance;

    @Nullable
    private volatile Context applicationContext;
    private long pauseTime;
    private long resumeTime;
    private long sessionResetAfterSec;
    private long sessionStartTime;

    @NonNull
    private final q versionManager = new q();

    @NonNull
    private final SessionManagerKtWrapper sessionManagerKtWrapper = new SessionManagerKtWrapper(this);

    @NonNull
    private String sessionId = "";

    @NonNull
    private final CopyOnWriteArraySet<Observer> observers = new CopyOnWriteArraySet<>();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Observer {
        void onSessionEvent(@NonNull Status status);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum Status {
        START,
        RESUME,
        PAUSE
    }

    public synchronized void attachContext(@NonNull Context context) {
        boolean z = this.applicationContext == null;
        this.applicationContext = context.getApplicationContext();
        if (z) {
            onContextAttached();
        }
    }

    @NonNull
    public static SessionManager get() {
        SessionManager sessionManager;
        SessionManager sessionManager2 = instance;
        if (sessionManager2 != null) {
            return sessionManager2;
        }
        synchronized (SessionManager.class) {
            try {
                sessionManager = instance;
                if (sessionManager == null) {
                    sessionManager = new SessionManager();
                    instance = sessionManager;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sessionManager;
    }

    private long getLastSessionDurationMs() {
        Context context = this.applicationContext;
        if (context != null) {
            return p.G(c.a(context), "last_session_duration", 0L);
        }
        a.d.w();
        return 0L;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void lambda$onNewSessionStarted$0(Context context) {
        Object obj;
        ArrayList arrayList;
        long j;
        Object next;
        io.p071bidmachine.util.version.a aVar;
        q qVar = this.versionManager;
        SessionManagerKtWrapper sessionManagerKtWrapper = this.sessionManagerKtWrapper;
        qVar.getClass();
        context.getClass();
        sessionManagerKtWrapper.getClass();
        io.p071bidmachine.util.version.a aVarQ = c.q("3.8.0");
        if (aVarQ == null) {
            a.d.m("Unexpected version parsing error: 3.8.0");
            aVarQ = new io.p071bidmachine.util.version.a(0, 0, 0);
        }
        io.p071bidmachine.util.version.a aVar2 = aVarQ;
        BidMachineSharedPreferenceKt bidMachineSharedPreferenceKt = BidMachineSharedPreferenceKt.INSTANCE;
        List historyVersionMilestoneList = bidMachineSharedPreferenceKt.getHistoryVersionMilestoneList(context);
        r currentVersionMilestone = bidMachineSharedPreferenceKt.getCurrentVersionMilestone(context);
        io.p071bidmachine.util.version.a aVar3 = currentVersionMilestone != null ? currentVersionMilestone.a : null;
        if (aVar2.equals(aVar3)) {
            obj = "VersionManager";
        } else {
            long sessionStartTime = sessionManagerKtWrapper.getSessionStartTime();
            io.p071bidmachine.util.version.a aVar4 = aVar3;
            obj = "VersionManager";
            r rVar = new r(aVar2, 0, sessionStartTime, sessionStartTime, 0L, 0L);
            ArrayList arrayListB0 = du.B0(historyVersionMilestoneList);
            if (currentVersionMilestone != null) {
                arrayList = arrayListB0;
                j = sessionStartTime;
                arrayList.add(r.a(currentVersionMilestone, 0, 0L, 0L, currentVersionMilestone.e, 15));
            } else {
                arrayList = arrayListB0;
                j = sessionStartTime;
            }
            bidMachineSharedPreferenceKt.setHistoryVersionMilestoneList(context, arrayList);
            if (
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v1 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 361
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.p071bidmachine.SessionManager.lambda$onNewSessionStarted$0(android.content.Context):void");
        }

        private void lambda$onSessionPaused$1(Context context) {
            q qVar = this.versionManager;
            SessionManagerKtWrapper sessionManagerKtWrapper = this.sessionManagerKtWrapper;
            qVar.getClass();
            context.getClass();
            sessionManagerKtWrapper.getClass();
            BidMachineSharedPreferenceKt bidMachineSharedPreferenceKt = BidMachineSharedPreferenceKt.INSTANCE;
            r currentVersionMilestone = bidMachineSharedPreferenceKt.getCurrentVersionMilestone(context);
            r rVarA = currentVersionMilestone != null ? r.a(currentVersionMilestone, 0, 0L, sessionManagerKtWrapper.getSessionDurationMs(), 0L, 47) : null;
            bidMachineSharedPreferenceKt.setCurrentVersionMilestone(context, rVarA);
            a.b("VersionManager", new o(rVarA, 1));
        }

        private void notifyObservers(@NonNull Status status) {
            Iterator<Observer> it = this.observers.iterator();
            while (it.hasNext()) {
                it.next().onSessionEvent(status);
            }
        }

        private void onNewSessionStarted() {
            Context context = this.applicationContext;
            if (context != null) {
                lambda$onNewSessionStarted$0(context);
            }
            notifyObservers(Status.START);
            a.c(TAG, "New session started");
        }

        private void onSessionPaused() {
            Context context = this.applicationContext;
            if (context != null) {
                lambda$onSessionPaused$1(context);
            }
        }

        private void saveCurrentSessionDuration(@NonNull Context context) {
            j.k(new mc3(14, this, context));
        }

        public void addObserver(@NonNull Observer observer) {
            this.observers.add(observer);
        }

        @WorkerThread
        public int getSessionCount() {
            Context context = this.applicationContext;
            if (context != null) {
                return p.F(c.a(context), "session_count", 0);
            }
            a.d.w();
            return 0;
        }

        public long getSessionDurationMs() {
            if (this.resumeTime == 0) {
                return 0L;
            }
            return System.currentTimeMillis() - this.sessionStartTime;
        }

        @NonNull
        public String getSessionId() {
            return this.sessionId;
        }

        public long getSessionStartTime() {
            return this.sessionStartTime;
        }

        public void pause() {
            if (this.resumeTime == 0) {
                return;
            }
            this.pauseTime = System.currentTimeMillis();
            onSessionPaused();
            notifyObservers(Status.PAUSE);
            Context context = this.applicationContext;
            if (context != null) {
                saveCurrentSessionDuration(context);
            }
            a.c(TAG, "Session paused: " + getSessionDurationSec() + " sec.");
        }

        public void removeObserver(@NonNull Observer observer) {
            this.observers.remove(observer);
        }

        public void setSessionResetAfter(long j) {
            this.sessionResetAfterSec = j;
        }

        private SessionManager() {
            startNewSession();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$saveCurrentSessionDuration$2(Context context) {
            p.O(c.a(context), "current_session_duration", Long.valueOf(getSessionDurationMs()));
        }

        private void onContextAttached() {
            onNewSessionStarted();
        }

        public int getLastSessionDurationSec() {
            return (int) (getLastSessionDurationMs() / 1000);
        }

        public int getSessionDurationSec() {
            return (int) (getSessionDurationMs() / 1000);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001f  */
        public void resume() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.sessionResetAfterSec;
            if (j > 0) {
                long j2 = this.pauseTime;
                if (j2 > 0 && jCurrentTimeMillis - j2 >= j * 1000) {
                    startNewSession();
                } else {
                    notifyObservers(Status.RESUME);
                    a.c(TAG, "Session resumed");
                }
            } else {
                notifyObservers(Status.RESUME);
                a.c(TAG, "Session resumed");
            }
            this.resumeTime = jCurrentTimeMillis;
        }

        @VisibleForTesting
        public void startNewSession() {
            this.sessionId = UUID.randomUUID().toString();
            this.sessionStartTime = System.currentTimeMillis();
            this.pauseTime = 0L;
            this.resumeTime = 0L;
            onNewSessionStarted();
        }
    }
