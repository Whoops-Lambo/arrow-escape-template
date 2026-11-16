package com.inmobi.media.core.config.models;

import android.webkit.URLUtil;
import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import com.inmobi.media.AbstractC4184lb;
import com.ironsource.Mb;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.eu;
import defpackage.gg0;
import defpackage.hg0;
import defpackage.i71;
import defpackage.ix;
import defpackage.j71;
import defpackage.l92;
import defpackage.p92;
import defpackage.tb5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001:\u000eGHIJKLMNOPQRSTB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010:\u001a\u00020 H\u0016J\b\u0010;\u001a\u00020<H\u0016J\u0006\u0010=\u001a\u00020\u0005J\u0006\u0010>\u001a\u00020\tJ\u0006\u0010?\u001a\u00020\u000bJ\u0006\u0010@\u001a\u00020\u000fJ\u0006\u0010A\u001a\u00020\rJ\u0006\u0010B\u001a\u00020\u001eJ\b\u0010C\u001a\u0004\u0018\u00010\u0007J\u0006\u0010D\u001a\u00020 J\u0006\u0010E\u001a\u00020\"J\u0006\u0010F\u001a\u000205R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0017@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u000205X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006U"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig;", "Lcom/inmobi/media/core/config/models/Config;", "<init>", "()V", "ice", "Lcom/inmobi/media/core/config/models/SignalsConfig$IceConfig;", "ext", "Lorg/json/JSONObject;", "unifiedIdServiceConfig", "Lcom/inmobi/media/core/config/models/SignalsConfig$UnifiedIdServiceConfig;", "novatiqConfig", "Lcom/inmobi/media/core/config/models/SignalsConfig$NovatiqConfig;", "session", "Lcom/inmobi/media/core/config/models/SignalsConfig$SessionConfig;", Mb.b, "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig;", "value", "Lcom/inmobi/media/core/config/models/SignalsConfig$InstalledAppConfig;", "installedAppConfig", "getInstalledAppConfig", "()Lcom/inmobi/media/core/config/models/SignalsConfig$InstalledAppConfig;", "setInstalledAppConfig", "(Lcom/inmobi/media/core/config/models/SignalsConfig$InstalledAppConfig;)V", "Lcom/inmobi/media/core/config/models/SignalsConfig$SynapseConfig;", "synapse", "getSynapse", "()Lcom/inmobi/media/core/config/models/SignalsConfig$SynapseConfig;", "setSynapse", "(Lcom/inmobi/media/core/config/models/SignalsConfig$SynapseConfig;)V", "fraud", "Lcom/inmobi/media/core/config/models/SignalsConfig$FraudSignals;", "kA", "", "vAK", "", "lowMemoryFreq", "getLowMemoryFreq", "()I", "setLowMemoryFreq", "(I)V", "bts", "Lcom/inmobi/media/core/config/models/SignalsConfig$BootTimeConfig;", "getBts", "()Lcom/inmobi/media/core/config/models/SignalsConfig$BootTimeConfig;", "setBts", "(Lcom/inmobi/media/core/config/models/SignalsConfig$BootTimeConfig;)V", "purchases", "Lcom/inmobi/media/core/config/models/SignalsConfig$Purchases;", "getPurchases", "()Lcom/inmobi/media/core/config/models/SignalsConfig$Purchases;", "setPurchases", "(Lcom/inmobi/media/core/config/models/SignalsConfig$Purchases;)V", "appActivityAnalytics", "Lcom/inmobi/media/core/config/models/SignalsConfig$AppActivityAnalyticsConfig;", "getAppActivityAnalytics", "()Lcom/inmobi/media/core/config/models/SignalsConfig$AppActivityAnalyticsConfig;", "setAppActivityAnalytics", "(Lcom/inmobi/media/core/config/models/SignalsConfig$AppActivityAnalyticsConfig;)V", "getType", "isValid", "", "getIceConfig", "getUnifiedIdServiceConfig", "getNovatiqConfig", "getPublisherConfig", "getSessionConfig", "getFraudSignalsConfig", "getExt", "getAK", "getAKV", "getAppActivityAnalyticsConfig", "IceConfig", "CellIceConfig", "NovatiqConfig", "SynapseConfig", "UnifiedIdServiceConfig", "PublisherConfig", "SessionConfig", "Purchases", "BootTimeConfig", "SynapseCollectorConfig", "AppActivityAnalyticsConfig", "InstalledAppConfig", "AppWithWeight", "FraudSignals", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SignalsConfig extends Config {

    @Nullable
    private JSONObject ext;

    @NotNull
    private IceConfig ice = new IceConfig();

    @NotNull
    private UnifiedIdServiceConfig unifiedIdServiceConfig = new UnifiedIdServiceConfig();

    @NotNull
    private NovatiqConfig novatiqConfig = new NovatiqConfig();

    @NotNull
    private SessionConfig session = new SessionConfig();

    @NotNull
    private PublisherConfig publisher = new PublisherConfig();

    @NotNull
    private InstalledAppConfig installedAppConfig = new InstalledAppConfig();

    @NotNull
    private SynapseConfig synapse = new SynapseConfig();

    @NotNull
    private FraudSignals fraud = new FraudSignals();

    @NotNull
    private String kA = "wWFMAWbSEtvl5VxZbQGMK7";
    private int vAK = 1;
    private int lowMemoryFreq = 300;

    @NotNull
    private BootTimeConfig bts = new BootTimeConfig();

    @NotNull
    private Purchases purchases = new Purchases();

    @NotNull
    private AppActivityAnalyticsConfig appActivityAnalytics = new AppActivityAnalyticsConfig();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$AppActivityAnalyticsConfig;", "Lcom/inmobi/media/core/config/models/SignalsConfig$SynapseCollectorConfig;", "<init>", "()V", "encPayload", "", "getEncPayload", "()Ljava/lang/String;", "setEncPayload", "(Ljava/lang/String;)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AppActivityAnalyticsConfig extends SynapseCollectorConfig {

        @NotNull
        private String encPayload = "";

        @NotNull
        public final String getEncPayload() {
            return this.encPayload;
        }

        public AppActivityAnalyticsConfig() {
            setEnabled(false);
            setRefreshAfterSecs(86400);
        }

        public final void setEncPayload(@NotNull String str) {
            str.getClass();
            this.encPayload = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$AppWithWeight;", "", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "wt", "", "getWt", "()I", "setWt", "(I)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AppWithWeight {

        @NotNull
        private String id = "";
        private int wt = 1;

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final int getWt() {
            return this.wt;
        }

        public final void setWt(int i) {
            this.wt = i;
        }

        public final void setId(@NotNull String str) {
            str.getClass();
            this.id = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$BootTimeConfig;", "", "<init>", "()V", "enabled", "", "getEnabled", "()Z", "maxEntries", "", "getMaxEntries", "()I", "threshold", "getThreshold", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BootTimeConfig {
        private final boolean enabled;
        private final int maxEntries = 3;
        private final int threshold = com.safedk.android.analytics.brandsafety.b.v;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getMaxEntries() {
            return this.maxEntries;
        }

        public final int getThreshold() {
            return this.threshold;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$CellIceConfig;", "", "<init>", "()V", "cof", "", "getCof", "()I", "setCof", "(I)V", "vce", "", "getVce", "()Z", "setVce", "(Z)V", "cce", "getCce", "setCce", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CellIceConfig {
        private boolean cce;
        private int cof;
        private boolean vce;

        public final boolean getCce() {
            return this.cce;
        }

        public final int getCof() {
            return this.cof;
        }

        public final boolean getVce() {
            return this.vce;
        }

        public final void setCce(boolean z) {
            this.cce = z;
        }

        public final void setCof(int i) {
            this.cof = i;
        }

        public final void setVce(boolean z) {
            this.vce = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u0012X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u0012X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\u00020\u0012X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001f¨\u0006$"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$FraudSignals;", "", "<init>", "()V", "jailBrokenEnabled", "", "getJailBrokenEnabled", "()Z", "debuggerAttachedEnabled", "getDebuggerAttachedEnabled", "hookEnabled", "getHookEnabled", "appInstallTimeEnabled", "getAppInstallTimeEnabled", "installSourceEnabled", "getInstallSourceEnabled", "suPaths", "", "", "getSuPaths", "()Ljava/util/List;", "magiskPaths", "getMagiskPaths", "rootPackages", "getRootPackages", "hookClasses", "getHookClasses", "hookLibs", "getHookLibs", "selinuxEnforcePath", "getSelinuxEnforcePath", "()Ljava/lang/String;", "procMapsPath", "getProcMapsPath", "procStatusPath", "getProcStatusPath", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FraudSignals {
        private final boolean appInstallTimeEnabled;
        private final boolean debuggerAttachedEnabled;
        private final boolean hookEnabled;
        private final boolean installSourceEnabled;
        private final boolean jailBrokenEnabled;

        @NotNull
        private final List<String> suPaths = eu.z("/system/bin/su", "/system/xbin/su", "/sbin/su", "/vendor/bin/su", "/su/bin/su");

        @NotNull
        private final List<String> magiskPaths = eu.z("/data/adb/magisk", "/sbin/.magisk", "/cache/magisk.log");

        @NotNull
        private final List<String> rootPackages = eu.z("com.topjohnwu.magisk", "eu.chainfire.supersu", "com.noshufou.android.su", "com.koushikdutta.superuser", "com.thirdparty.superuser");

        @NotNull
        private final List<String> hookClasses = eu.z("de.robv.android.xposed.XposedBridge", "de.robv.android.xposed.XC_MethodHook", "com.saurik.substrate.MS");

        @NotNull
        private final List<String> hookLibs = eu.z("xposed", "substrate", "frida", "libfrida-gadget");

        @NotNull
        private final String selinuxEnforcePath = "/sys/fs/selinux/enforce";

        @NotNull
        private final String procMapsPath = "/proc/self/maps";

        @NotNull
        private final String procStatusPath = "/proc/self/status";

        public final boolean getAppInstallTimeEnabled() {
            return this.appInstallTimeEnabled;
        }

        public final boolean getDebuggerAttachedEnabled() {
            return this.debuggerAttachedEnabled;
        }

        @NotNull
        public final List<String> getHookClasses() {
            return this.hookClasses;
        }

        public final boolean getHookEnabled() {
            return this.hookEnabled;
        }

        @NotNull
        public final List<String> getHookLibs() {
            return this.hookLibs;
        }

        public final boolean getInstallSourceEnabled() {
            return this.installSourceEnabled;
        }

        public final boolean getJailBrokenEnabled() {
            return this.jailBrokenEnabled;
        }

        @NotNull
        public final List<String> getMagiskPaths() {
            return this.magiskPaths;
        }

        @NotNull
        public final String getProcMapsPath() {
            return this.procMapsPath;
        }

        @NotNull
        public final String getProcStatusPath() {
            return this.procStatusPath;
        }

        @NotNull
        public final List<String> getRootPackages() {
            return this.rootPackages;
        }

        @NotNull
        public final String getSelinuxEnforcePath() {
            return this.selinuxEnforcePath;
        }

        @NotNull
        public final List<String> getSuPaths() {
            return this.suPaths;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$IceConfig;", "", "<init>", "()V", "locationEnabled", "", "sessionEnabled", "c", "Lcom/inmobi/media/core/config/models/SignalsConfig$CellIceConfig;", "isLocationEnabled", "isSessionEnabled", "getCellOperatorFlag", "", "isVisibleCellTowerEnabled", "isConnectedCellTowerEnabled", "isValid", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IceConfig {

        @NotNull
        private CellIceConfig c = new CellIceConfig();
        private boolean locationEnabled;
        private boolean sessionEnabled;

        public final int getCellOperatorFlag() {
            return this.c.getCof();
        }

        public final boolean isConnectedCellTowerEnabled() {
            return this.c.getCce();
        }

        /* JADX INFO: renamed from: isLocationEnabled, reason: from getter */
        public final boolean getLocationEnabled() {
            return this.locationEnabled;
        }

        /* JADX INFO: renamed from: isSessionEnabled, reason: from getter */
        public final boolean getSessionEnabled() {
            return this.sessionEnabled;
        }

        public final boolean isVisibleCellTowerEnabled() {
            return this.c.getVce();
        }

        public final boolean isValid() {
            if (getCellOperatorFlag() >= 0) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$InstalledAppConfig;", "Lcom/inmobi/media/core/config/models/SignalsConfig$SynapseCollectorConfig;", "<init>", "()V", HandleInvocationsFromAdViewer.KEY_PAYLOAD, "Lorg/json/JSONObject;", "getPayload", "()Lorg/json/JSONObject;", "setPayload", "(Lorg/json/JSONObject;)V", "scanLimit", "", "getScanLimit", "()I", "setScanLimit", "(I)V", "getPayloadData", "", "", "", "Lcom/inmobi/media/core/config/models/SignalsConfig$AppWithWeight;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InstalledAppConfig extends SynapseCollectorConfig {

        @NotNull
        private JSONObject payload = new JSONObject();
        private int scanLimit = 30;

        @NotNull
        public final JSONObject getPayload() {
            return this.payload;
        }

        @NotNull
        public final Map<String, List<AppWithWeight>> getPayloadData() {
            try {
                Iterator<String> itKeys = this.payload.keys();
                itKeys.getClass();
                l92 l92VarF = p92.F(itKeys);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : (ix) l92VarF) {
                    JSONArray jSONArray = this.payload.getJSONArray((String) obj);
                    j71 j71VarD = tb5.D(0, jSONArray.length());
                    ArrayList arrayList = new ArrayList();
                    i71 it = j71VarD.iterator();
                    while (it.d) {
                        JSONObject jSONObject = jSONArray.getJSONObject(it.nextInt());
                        jSONObject.getClass();
                        AppWithWeight appWithWeight = (AppWithWeight) AppWithWeight.class.cast(AbstractC4184lb.a(jSONObject, AppWithWeight.class, null, null));
                        if (appWithWeight != null) {
                            arrayList.add(appWithWeight);
                        }
                    }
                    linkedHashMap.put(obj, arrayList);
                }
                return linkedHashMap;
            } catch (Exception unused) {
                return hg0.a;
            }
        }

        public final int getScanLimit() {
            return this.scanLimit;
        }

        public final void setScanLimit(int i) {
            this.scanLimit = i;
        }

        public InstalledAppConfig() {
            setEnabled(false);
            setRefreshAfterSecs(86400);
        }

        public final void setPayload(@NotNull JSONObject jSONObject) {
            jSONObject.getClass();
            this.payload = jSONObject;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\n@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$NovatiqConfig;", "", "<init>", "()V", "value", "", "isNovatiqEnabled", "()Z", "setNovatiqEnabled", "(Z)V", "", "", "carrierNames", "getCarrierNames", "()Ljava/util/List;", "setCarrierNames", "(Ljava/util/List;)V", "beaconUrl", "getBeaconUrl", "()Ljava/lang/String;", "setBeaconUrl", "(Ljava/lang/String;)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NovatiqConfig {
        private boolean isNovatiqEnabled = true;

        @NotNull
        private List<String> carrierNames = gg0.a;

        @NotNull
        private String beaconUrl = "https://spadsync.com/sync";

        @NotNull
        public final String getBeaconUrl() {
            return this.beaconUrl;
        }

        @NotNull
        public final List<String> getCarrierNames() {
            return this.carrierNames;
        }

        /* JADX INFO: renamed from: isNovatiqEnabled, reason: from getter */
        public final boolean getIsNovatiqEnabled() {
            return this.isNovatiqEnabled;
        }

        @VisibleForTesting
        public final void setNovatiqEnabled(boolean z) {
            this.isNovatiqEnabled = z;
        }

        @VisibleForTesting
        public final void setBeaconUrl(@NotNull String str) {
            str.getClass();
            this.beaconUrl = str;
        }

        @VisibleForTesting
        public final void setCarrierNames(@NotNull List<String> list) {
            list.getClass();
            this.carrierNames = list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Keep
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0006!\"#$%&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001fJ\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig;", "", "<init>", "()V", "enableMCO", "", "getEnableMCO", "()Z", "enableAB", "getEnableAB", "generalKeys", "", "", "adSpecificKeys", "payloadSize", "", "getPayloadSize", "()I", "auto", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$AutoInputData;", "getAuto", "()Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$AutoInputData;", "obj", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$ObjInputData;", "getObj", "()Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$ObjInputData;", "direct", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$DirectInputData;", "getDirect", "()Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$DirectInputData;", "getGeneralKeys", "", "getAdSpecificKeys", "DirectInputData", "ObjInputData", "AutoInputData", "BaseInputData", "KeyData", "DepthData", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PublisherConfig {
        private final boolean enableAB;
        private final boolean enableMCO;

        @NotNull
        private final Map<String, String> generalKeys = new LinkedHashMap();

        @NotNull
        private final Map<String, String> adSpecificKeys = new LinkedHashMap();
        private final int payloadSize = 6000;

        @NotNull
        private final AutoInputData auto = new AutoInputData();

        @NotNull
        private final ObjInputData obj = new ObjInputData();

        @NotNull
        private final DirectInputData direct = new DirectInputData();

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Keep
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$AutoInputData;", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$BaseInputData;", "<init>", "()V", "allowedKeys", "", "", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$KeyData;", "getAllowedKeys", "()Ljava/util/Map;", "incompatibleSdkVer", "", "getIncompatibleSdkVer", "()Ljava/util/List;", "topic", "getTopic", "()Ljava/lang/String;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AutoInputData extends BaseInputData {

            @NotNull
            private final Map<String, KeyData> allowedKeys = new LinkedHashMap();

            @NotNull
            private final List<String> incompatibleSdkVer = gg0.a;

            @NotNull
            private final String topic = "";

            @NotNull
            public final Map<String, KeyData> getAllowedKeys() {
                return this.allowedKeys;
            }

            @NotNull
            public final List<String> getIncompatibleSdkVer() {
                return this.incompatibleSdkVer;
            }

            @NotNull
            public final String getTopic() {
                return this.topic;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Keep
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$BaseInputData;", "", "<init>", "()V", "enabled", "", "getEnabled", "()Z", "expiry", "", "getExpiry", "()I", "count", "getCount", "precision", "getPrecision", "strLen", "getStrLen", "depth", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$DepthData;", "getDepth", "()Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$DepthData;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static class BaseInputData {
            private final boolean enabled;
            private final int expiry = 604800;
            private final int count = 5;
            private final int precision = 6;
            private final int strLen = 3;

            @NotNull
            private final DepthData depth = new DepthData();

            public final int getCount() {
                return this.count;
            }

            @NotNull
            public final DepthData getDepth() {
                return this.depth;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final int getExpiry() {
                return this.expiry;
            }

            public final int getPrecision() {
                return this.precision;
            }

            public final int getStrLen() {
                return this.strLen;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Keep
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$DepthData;", "", "<init>", "()V", "enabled", "", "getEnabled", "()Z", "sessionEnabled", "getSessionEnabled", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DepthData {
            private final boolean enabled;
            private final boolean sessionEnabled;

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final boolean getSessionEnabled() {
                return this.sessionEnabled;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Keep
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$DirectInputData;", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$BaseInputData;", "<init>", "()V", "allowedKeys", "", "", "getAllowedKeys", "()Ljava/util/Map;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DirectInputData extends BaseInputData {

            @NotNull
            private final Map<String, String> allowedKeys = new LinkedHashMap();

            @NotNull
            public final Map<String, String> getAllowedKeys() {
                return this.allowedKeys;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Keep
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$KeyData;", "", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "type", "getType", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class KeyData {

            @NotNull
            private final String name = "";

            @NotNull
            private final String type = "";

            @NotNull
            public final String getName() {
                return this.name;
            }

            @NotNull
            public final String getType() {
                return this.type;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Keep
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$ObjInputData;", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$BaseInputData;", "<init>", "()V", "allowedKeysAnd", "", "", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$KeyData;", "getAllowedKeysAnd", "()Ljava/util/Map;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ObjInputData extends BaseInputData {

            @NotNull
            private final Map<String, KeyData> allowedKeysAnd = new LinkedHashMap();

            @NotNull
            public final Map<String, KeyData> getAllowedKeysAnd() {
                return this.allowedKeysAnd;
            }
        }

        @NotNull
        public final Map<String, String> getAdSpecificKeys() {
            return this.adSpecificKeys;
        }

        @NotNull
        public final AutoInputData getAuto() {
            return this.auto;
        }

        @NotNull
        public final DirectInputData getDirect() {
            return this.direct;
        }

        public final boolean getEnableAB() {
            return this.enableAB;
        }

        public final boolean getEnableMCO() {
            return this.enableMCO;
        }

        @NotNull
        public final Map<String, String> getGeneralKeys() {
            return this.generalKeys;
        }

        @NotNull
        public final ObjInputData getObj() {
            return this.obj;
        }

        public final int getPayloadSize() {
            return this.payloadSize;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$Purchases;", "", "<init>", "()V", "inapp", "", "getInapp", "()Z", "setInapp", "(Z)V", "versionList", "", "", "getVersionList", "()Ljava/util/List;", "setVersionList", "(Ljava/util/List;)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Purchases {
        private boolean inapp;

        @NotNull
        private List<String> versionList = eu.z("7.0.0", "7.1.0", "7.1.1");

        public final boolean getInapp() {
            return this.inapp;
        }

        @NotNull
        public final List<String> getVersionList() {
            return this.versionList;
        }

        public final void setInapp(boolean z) {
            this.inapp = z;
        }

        public final void setVersionList(@NotNull List<String> list) {
            list.getClass();
            this.versionList = list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0006\u0010\u0014\u001a\u00020\u000eJ\u0006\u0010\u0015\u001a\u00020\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$SessionConfig;", "", "<init>", "()V", "control", "", "", "fgBgModelEnabled", "", "getFgBgModelEnabled", "()Z", "setFgBgModelEnabled", "(Z)V", "timeoutSeconds", "", "getTimeoutSeconds", "()J", "setTimeoutSeconds", "(J)V", "getSigControlList", "getTimeoutMillis", "isForegroundBackgroundModelEnabled", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SessionConfig {
        private boolean fgBgModelEnabled;

        @NotNull
        private List<Integer> control = eu.z(0, 1, 2, 3, 4, 5, 6);
        private long timeoutSeconds = 1800;

        public final boolean getFgBgModelEnabled() {
            return this.fgBgModelEnabled;
        }

        @NotNull
        public final List<Integer> getSigControlList() {
            return this.control;
        }

        public final long getTimeoutMillis() {
            return this.timeoutSeconds * 1000;
        }

        public final long getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public final boolean isForegroundBackgroundModelEnabled() {
            return this.fgBgModelEnabled;
        }

        public final void setFgBgModelEnabled(boolean z) {
            this.fgBgModelEnabled = z;
        }

        public final void setTimeoutSeconds(long j) {
            this.timeoutSeconds = j;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0016\u001a\u00020\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$SynapseCollectorConfig;", "", "<init>", "()V", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "refreshAfterSecs", "", "getRefreshAfterSecs", "()I", "setRefreshAfterSecs", "(I)V", "maxRetries", "getMaxRetries", "setMaxRetries", "disableOnMaxRetries", "getDisableOnMaxRetries", "setDisableOnMaxRetries", "isEnabled", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class SynapseCollectorConfig {
        private boolean disableOnMaxRetries;
        private boolean enabled;
        private int refreshAfterSecs = 86400;
        private int maxRetries = 3;

        public final boolean getDisableOnMaxRetries() {
            return this.disableOnMaxRetries;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getRefreshAfterSecs() {
            return this.refreshAfterSecs;
        }

        public final boolean isEnabled() {
            return this.enabled && this.refreshAfterSecs > 0;
        }

        public final void setDisableOnMaxRetries(boolean z) {
            this.disableOnMaxRetries = z;
        }

        public final void setEnabled(boolean z) {
            this.enabled = z;
        }

        public final void setMaxRetries(int i) {
            this.maxRetries = i;
        }

        public final void setRefreshAfterSecs(int i) {
            this.refreshAfterSecs = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0019\u001a\u00020\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$SynapseConfig;", "", "<init>", "()V", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "pushUrl", "", "getPushUrl", "()Ljava/lang/String;", "setPushUrl", "(Ljava/lang/String;)V", "maxRetryCount", "", "getMaxRetryCount", "()I", "setMaxRetryCount", "(I)V", "retryInterval", "getRetryInterval", "setRetryInterval", "isEnabled", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SynapseConfig {
        private boolean enabled;

        @NotNull
        private String pushUrl = "https://synapse.exchange.inmobi.com/v1/signals/push";
        private int maxRetryCount = 3;
        private int retryInterval = 10;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getMaxRetryCount() {
            return this.maxRetryCount;
        }

        @NotNull
        public final String getPushUrl() {
            return this.pushUrl;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final boolean isEnabled() {
            return this.enabled && URLUtil.isValidUrl(this.pushUrl);
        }

        public final void setEnabled(boolean z) {
            this.enabled = z;
        }

        public final void setMaxRetryCount(int i) {
            this.maxRetryCount = i;
        }

        public final void setRetryInterval(int i) {
            this.retryInterval = i;
        }

        public final void setPushUrl(@NotNull String str) {
            str.getClass();
            this.pushUrl = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001d\u001a\u00020\u0005J\u0006\u0010\u001e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$UnifiedIdServiceConfig;", "", "<init>", "()V", "enabled", "", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "maxRetries", "", "getMaxRetries", "()I", "setMaxRetries", "(I)V", "retryInterval", "getRetryInterval", "setRetryInterval", "timeout", "getTimeout", "setTimeout", "latOptOutCheck", "getLatOptOutCheck", "()Z", "setLatOptOutCheck", "(Z)V", "isEnabled", "isValid", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnifiedIdServiceConfig {
        private boolean enabled;
        private boolean latOptOutCheck;
        private int maxRetries;
        private int retryInterval;

        @NotNull
        private String url = "https://unif-id.ssp.inmobi.com/fetch";
        private int timeout = 10;

        public final boolean getLatOptOutCheck() {
            return this.latOptOutCheck;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final int getTimeout() {
            return this.timeout;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: isEnabled, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public final boolean isValid() {
            return URLUtil.isValidUrl(this.url) && this.maxRetries >= 0 && this.timeout >= 0 && this.retryInterval >= 0;
        }

        public final void setLatOptOutCheck(boolean z) {
            this.latOptOutCheck = z;
        }

        public final void setMaxRetries(int i) {
            this.maxRetries = i;
        }

        public final void setRetryInterval(int i) {
            this.retryInterval = i;
        }

        public final void setTimeout(int i) {
            this.timeout = i;
        }

        public final void setUrl(@NotNull String str) {
            str.getClass();
            this.url = str;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getAK, reason: from getter */
    public final String getKA() {
        return this.kA;
    }

    /* JADX INFO: renamed from: getAKV, reason: from getter */
    public final int getVAK() {
        return this.vAK;
    }

    @NotNull
    public final AppActivityAnalyticsConfig getAppActivityAnalytics() {
        return this.appActivityAnalytics;
    }

    @NotNull
    public final AppActivityAnalyticsConfig getAppActivityAnalyticsConfig() {
        return this.appActivityAnalytics;
    }

    @NotNull
    public final BootTimeConfig getBts() {
        return this.bts;
    }

    @Nullable
    public final JSONObject getExt() {
        return this.ext;
    }

    @NotNull
    /* JADX INFO: renamed from: getFraudSignalsConfig, reason: from getter */
    public final FraudSignals getFraud() {
        return this.fraud;
    }

    @NotNull
    /* JADX INFO: renamed from: getIceConfig, reason: from getter */
    public final IceConfig getIce() {
        return this.ice;
    }

    @NotNull
    public final InstalledAppConfig getInstalledAppConfig() {
        return this.installedAppConfig;
    }

    public final int getLowMemoryFreq() {
        return this.lowMemoryFreq;
    }

    @NotNull
    public final NovatiqConfig getNovatiqConfig() {
        return this.novatiqConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: getPublisherConfig, reason: from getter */
    public final PublisherConfig getPublisher() {
        return this.publisher;
    }

    @NotNull
    public final Purchases getPurchases() {
        return this.purchases;
    }

    @NotNull
    /* JADX INFO: renamed from: getSessionConfig, reason: from getter */
    public final SessionConfig getSession() {
        return this.session;
    }

    @NotNull
    public final SynapseConfig getSynapse() {
        return this.synapse;
    }

    @Override // com.inmobi.media.core.config.models.Config
    @NotNull
    public String getType() {
        return "signals";
    }

    @NotNull
    public final UnifiedIdServiceConfig getUnifiedIdServiceConfig() {
        return this.unifiedIdServiceConfig;
    }

    @Override // com.inmobi.media.core.config.models.Config
    public boolean isValid() {
        return this.ice.isValid() && this.unifiedIdServiceConfig.isValid();
    }

    public final void setLowMemoryFreq(int i) {
        this.lowMemoryFreq = i;
    }

    public final void setAppActivityAnalytics(@NotNull AppActivityAnalyticsConfig appActivityAnalyticsConfig) {
        appActivityAnalyticsConfig.getClass();
        this.appActivityAnalytics = appActivityAnalyticsConfig;
    }

    public final void setBts(@NotNull BootTimeConfig bootTimeConfig) {
        bootTimeConfig.getClass();
        this.bts = bootTimeConfig;
    }

    @VisibleForTesting
    public final void setInstalledAppConfig(@NotNull InstalledAppConfig installedAppConfig) {
        installedAppConfig.getClass();
        this.installedAppConfig = installedAppConfig;
    }

    public final void setPurchases(@NotNull Purchases purchases) {
        purchases.getClass();
        this.purchases = purchases;
    }

    @VisibleForTesting
    public final void setSynapse(@NotNull SynapseConfig synapseConfig) {
        synapseConfig.getClass();
        this.synapse = synapseConfig;
    }
}
