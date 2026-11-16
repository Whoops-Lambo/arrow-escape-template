package com.google.android.gms.dynamite;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.common.zzc;
import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.c7;
import defpackage.gl0;
import defpackage.h74;
import defpackage.q35;
import defpackage.rl3;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@KeepForSdk
public final class DynamiteModule {
    public static Boolean f = null;
    public static String g = null;
    public static boolean h = false;
    public static int i = -1;
    public static Boolean j;
    public static zzp n;
    public static zzq o;
    public final Context a;
    public static final ThreadLocal k = new ThreadLocal();
    public static final gl0 l = new gl0(4);
    public static final a m = new a();
    public static final b b = new b();
    public static final c c = new c();
    public static final d d = new d();
    public static final e e = new e();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @NonNull
        public static ClassLoader sClassLoader;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface VersionPolicy {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @KeepForSdk
        public interface IVersions {
            int a(Context context, String str);

            int b(Context context, String str, boolean z);
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @KeepForSdk
        public static class SelectionResult {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        SelectionResult a(Context context, String str, IVersions iVersions);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @KeepForSdk
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, Throwable th, byte[] bArr) {
            super(str, th);
        }

        public /* synthetic */ LoadingException(String str, byte[] bArr) {
            super(str);
        }
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50 + str.length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(str.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0240 A[Catch: all -> 0x0228, LoadingException -> 0x022b, RemoteException -> 0x022e, TryCatch #10 {RemoteException -> 0x022e, LoadingException -> 0x022b, all -> 0x0228, blocks: (B:89:0x0219, B:102:0x0261, B:104:0x0267, B:105:0x0270, B:106:0x0278, B:96:0x0231, B:97:0x023b, B:100:0x0240, B:101:0x0251, B:107:0x0279, B:108:0x0283, B:109:0x0284, B:110:0x028e, B:118:0x02a0), top: B:168:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:101:0x0251 A[Catch: all -> 0x0228, LoadingException -> 0x022b, RemoteException -> 0x022e, TryCatch #10 {RemoteException -> 0x022e, LoadingException -> 0x022b, all -> 0x0228, blocks: (B:89:0x0219, B:102:0x0261, B:104:0x0267, B:105:0x0270, B:106:0x0278, B:96:0x0231, B:97:0x023b, B:100:0x0240, B:101:0x0251, B:107:0x0279, B:108:0x0283, B:109:0x0284, B:110:0x028e, B:118:0x02a0), top: B:168:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0267 A[Catch: all -> 0x0228, LoadingException -> 0x022b, RemoteException -> 0x022e, TryCatch #10 {RemoteException -> 0x022e, LoadingException -> 0x022b, all -> 0x0228, blocks: (B:89:0x0219, B:102:0x0261, B:104:0x0267, B:105:0x0270, B:106:0x0278, B:96:0x0231, B:97:0x023b, B:100:0x0240, B:101:0x0251, B:107:0x0279, B:108:0x0283, B:109:0x0284, B:110:0x028e, B:118:0x02a0), top: B:168:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0270 A[Catch: all -> 0x0228, LoadingException -> 0x022b, RemoteException -> 0x022e, TryCatch #10 {RemoteException -> 0x022e, LoadingException -> 0x022b, all -> 0x0228, blocks: (B:89:0x0219, B:102:0x0261, B:104:0x0267, B:105:0x0270, B:106:0x0278, B:96:0x0231, B:97:0x023b, B:100:0x0240, B:101:0x0251, B:107:0x0279, B:108:0x0283, B:109:0x0284, B:110:0x028e, B:118:0x02a0), top: B:168:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0279 A[Catch: all -> 0x0228, LoadingException -> 0x022b, RemoteException -> 0x022e, TryCatch #10 {RemoteException -> 0x022e, LoadingException -> 0x022b, all -> 0x0228, blocks: (B:89:0x0219, B:102:0x0261, B:104:0x0267, B:105:0x0270, B:106:0x0278, B:96:0x0231, B:97:0x023b, B:100:0x0240, B:101:0x0251, B:107:0x0279, B:108:0x0283, B:109:0x0284, B:110:0x028e, B:118:0x02a0), top: B:168:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0284 A[Catch: all -> 0x0228, LoadingException -> 0x022b, RemoteException -> 0x022e, TryCatch #10 {RemoteException -> 0x022e, LoadingException -> 0x022b, all -> 0x0228, blocks: (B:89:0x0219, B:102:0x0261, B:104:0x0267, B:105:0x0270, B:106:0x0278, B:96:0x0231, B:97:0x023b, B:100:0x0240, B:101:0x0251, B:107:0x0279, B:108:0x0283, B:109:0x0284, B:110:0x028e, B:118:0x02a0), top: B:168:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0293  */
    /* JADX WARN: Code duplicated, block: B:135:0x0307  */
    /* JADX WARN: Code duplicated, block: B:136:0x030d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0316  */
    /* JADX WARN: Code duplicated, block: B:144:0x0328 A[Catch: all -> 0x00b8, TryCatch #11 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:31:0x00ec, B:119:0x02a1, B:120:0x02ac, B:128:0x02bc, B:130:0x02e4, B:132:0x02f3, B:142:0x031f, B:143:0x0327, B:123:0x02af, B:124:0x02b0, B:125:0x02b8, B:144:0x0328, B:145:0x0349, B:146:0x034a, B:147:0x0398), top: B:167:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00c3 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #11 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:31:0x00ec, B:119:0x02a1, B:120:0x02ac, B:128:0x02bc, B:130:0x02e4, B:132:0x02f3, B:142:0x031f, B:143:0x0327, B:123:0x02af, B:124:0x02b0, B:125:0x02b8, B:144:0x0328, B:145:0x0349, B:146:0x034a, B:147:0x0398), top: B:167:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:23:0x00db  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f7 A[Catch: all -> 0x028f, TryCatch #5 {all -> 0x028f, blocks: (B:34:0x00f1, B:36:0x00f7, B:37:0x00f9), top: B:165:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00fc A[Catch: all -> 0x0173, LoadingException -> 0x0178, RemoteException -> 0x017d, TRY_ENTER, TryCatch #11 {RemoteException -> 0x017d, LoadingException -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ae, B:65:0x0182, B:73:0x01b1, B:74:0x01b2, B:75:0x01ba, B:76:0x01bb, B:77:0x01c3, B:80:0x01c6, B:81:0x01c7, B:83:0x01fa, B:85:0x020d, B:87:0x0215), top: B:168:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0103 A[Catch: all -> 0x0173, LoadingException -> 0x0178, RemoteException -> 0x017d, TryCatch #11 {RemoteException -> 0x017d, LoadingException -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ae, B:65:0x0182, B:73:0x01b1, B:74:0x01b2, B:75:0x01ba, B:76:0x01bb, B:77:0x01c3, B:80:0x01c6, B:81:0x01c7, B:83:0x01fa, B:85:0x020d, B:87:0x0215), top: B:168:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0138 A[Catch: all -> 0x0173, LoadingException -> 0x0178, RemoteException -> 0x017d, TRY_ENTER, TryCatch #11 {RemoteException -> 0x017d, LoadingException -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ae, B:65:0x0182, B:73:0x01b1, B:74:0x01b2, B:75:0x01ba, B:76:0x01bb, B:77:0x01c3, B:80:0x01c6, B:81:0x01c7, B:83:0x01fa, B:85:0x020d, B:87:0x0215), top: B:168:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01bb A[Catch: all -> 0x0173, LoadingException -> 0x0178, RemoteException -> 0x017d, TryCatch #11 {RemoteException -> 0x017d, LoadingException -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ae, B:65:0x0182, B:73:0x01b1, B:74:0x01b2, B:75:0x01ba, B:76:0x01bb, B:77:0x01c3, B:80:0x01c6, B:81:0x01c7, B:83:0x01fa, B:85:0x020d, B:87:0x0215), top: B:168:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c7 A[Catch: all -> 0x0173, LoadingException -> 0x0178, RemoteException -> 0x017d, TryCatch #11 {RemoteException -> 0x017d, LoadingException -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ae, B:65:0x0182, B:73:0x01b1, B:74:0x01b2, B:75:0x01ba, B:76:0x01bb, B:77:0x01c3, B:80:0x01c6, B:81:0x01c7, B:83:0x01fa, B:85:0x020d, B:87:0x0215), top: B:168:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01fa A[Catch: all -> 0x0173, LoadingException -> 0x0178, RemoteException -> 0x017d, TryCatch #11 {RemoteException -> 0x017d, LoadingException -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ae, B:65:0x0182, B:73:0x01b1, B:74:0x01b2, B:75:0x01ba, B:76:0x01bb, B:77:0x01c3, B:80:0x01c6, B:81:0x01c7, B:83:0x01fa, B:85:0x020d, B:87:0x0215), top: B:168:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x020d A[Catch: all -> 0x0173, LoadingException -> 0x0178, RemoteException -> 0x017d, TryCatch #11 {RemoteException -> 0x017d, LoadingException -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ae, B:65:0x0182, B:73:0x01b1, B:74:0x01b2, B:75:0x01ba, B:76:0x01bb, B:77:0x01c3, B:80:0x01c6, B:81:0x01c7, B:83:0x01fa, B:85:0x020d, B:87:0x0215), top: B:168:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0215 A[Catch: all -> 0x0173, LoadingException -> 0x0178, RemoteException -> 0x017d, TRY_LEAVE, TryCatch #11 {RemoteException -> 0x017d, LoadingException -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ae, B:65:0x0182, B:73:0x01b1, B:74:0x01b2, B:75:0x01ba, B:76:0x01bb, B:77:0x01c3, B:80:0x01c6, B:81:0x01c7, B:83:0x01fa, B:85:0x020d, B:87:0x0215), top: B:168:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0231 A[Catch: all -> 0x0228, LoadingException -> 0x022b, RemoteException -> 0x022e, TryCatch #10 {RemoteException -> 0x022e, LoadingException -> 0x022b, all -> 0x0228, blocks: (B:89:0x0219, B:102:0x0261, B:104:0x0267, B:105:0x0270, B:106:0x0278, B:96:0x0231, B:97:0x023b, B:100:0x0240, B:101:0x0251, B:107:0x0279, B:108:0x0283, B:109:0x0284, B:110:0x028e, B:118:0x02a0), top: B:168:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x023c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.google.android.gms.dynamite.DynamiteModule$VersionPolicy] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static DynamiteModule c(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        ?? r7;
        int i2;
        DynamiteModule dynamiteModule;
        Cursor cursor;
        int i3;
        ?? r8;
        Boolean bool;
        zzp zzpVarH;
        int i4;
        IObjectWrapper iObjectWrapperR;
        Object objZ1;
        q35 q35Var;
        zzq zzqVar;
        q35 q35Var2;
        boolean z;
        IObjectWrapper iObjectWrapperR2;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new LoadingException("null application Context", null);
        }
        ThreadLocal threadLocal = k;
        q35 q35Var3 = (q35) threadLocal.get();
        q35 q35Var4 = new q35();
        threadLocal.set(q35Var4);
        gl0 gl0Var = l;
        Long l2 = (Long) gl0Var.get();
        long jLongValue = l2.longValue();
        try {
            gl0Var.set(Long.valueOf(SystemClock.uptimeMillis()));
            VersionPolicy.SelectionResult selectionResultA = versionPolicy.a(context, str, m);
            int i5 = selectionResultA.a;
            int i6 = selectionResultA.b;
            StringBuilder sb = new StringBuilder(str.length() + 26 + String.valueOf(i5).length() + 19 + str.length() + 1 + String.valueOf(i6).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i5);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i6);
            Log.i("DynamiteModule", sb.toString());
            int i7 = selectionResultA.c;
            if (i7 != 0) {
                if (i7 != -1) {
                    if (i7 == 1 || selectionResultA.b != 0) {
                        if (i7 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            DynamiteModule dynamiteModule2 = new DynamiteModule(applicationContext);
                            if (jLongValue == 0) {
                                gl0Var.remove();
                            } else {
                                gl0Var.set(l2);
                            }
                            cursor2 = q35Var4.a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(q35Var3);
                            return dynamiteModule2;
                        }
                        if (i7 == 1) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 36);
                            sb2.append("VersionPolicy returned invalid code:");
                            sb2.append(i7);
                            throw new LoadingException(sb2.toString(), null);
                        }
                        try {
                            try {
                                i3 = selectionResultA.b;
                                try {
                                    try {
                                        try {
                                            synchronized (DynamiteModule.class) {
                                                try {
                                                    if (e(context)) {
                                                        throw new LoadingException("Remote loading disabled", null);
                                                    }
                                                    bool = f;
                                                    if (bool != null) {
                                                        throw new LoadingException("Failed to determine which loading route to use.", null);
                                                    }
                                                    if (bool.booleanValue()) {
                                                        StringBuilder sb3 = new StringBuilder(str.length() + 40 + String.valueOf(i3).length());
                                                        sb3.append("Selected remote version of ");
                                                        sb3.append(str);
                                                        sb3.append(", version >= ");
                                                        sb3.append(i3);
                                                        Log.i("DynamiteModule", sb3.toString());
                                                        synchronized (DynamiteModule.class) {
                                                            zzqVar = o;
                                                        }
                                                        if (zzqVar != null) {
                                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                                        }
                                                        q35Var2 = (q35) threadLocal.get();
                                                        if (q35Var2 != null || q35Var2.a == null) {
                                                            throw new LoadingException("No result cursor", null);
                                                        }
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor3 = q35Var2.a;
                                                        new ObjectWrapper(null);
                                                        synchronized (DynamiteModule.class) {
                                                            z = i >= 2;
                                                        }
                                                        if (z) {
                                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                            iObjectWrapperR2 = zzqVar.z1(new ObjectWrapper(applicationContext2), str, i3, new ObjectWrapper(cursor3));
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                            iObjectWrapperR2 = zzqVar.r(new ObjectWrapper(applicationContext2), str, i3, new ObjectWrapper(cursor3));
                                                        }
                                                        Context context2 = (Context) ObjectWrapper.z1(iObjectWrapperR2);
                                                        if (context2 == null) {
                                                            throw new LoadingException("Failed to get module context", null);
                                                        }
                                                        dynamiteModule = new DynamiteModule(context2);
                                                    } else {
                                                        StringBuilder sb4 = new StringBuilder(str.length() + 40 + String.valueOf(i3).length());
                                                        sb4.append("Selected remote version of ");
                                                        sb4.append(str);
                                                        sb4.append(", version >= ");
                                                        sb4.append(i3);
                                                        Log.i("DynamiteModule", sb4.toString());
                                                        zzpVarH = h(context);
                                                        if (zzpVarH != null) {
                                                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                                        }
                                                        Parcel parcelZzB = zzpVarH.zzB(6, zzpVarH.zza());
                                                        i4 = parcelZzB.readInt();
                                                        parcelZzB.recycle();
                                                        if (i4 >= 3) {
                                                            q35Var = (q35) threadLocal.get();
                                                            if (q35Var != null) {
                                                                throw new LoadingException("No cached result cursor holder", null);
                                                            }
                                                            iObjectWrapperR = zzpVarH.A1(new ObjectWrapper(context), str, i3, new ObjectWrapper(q35Var.a));
                                                        } else if (i4 == 2) {
                                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                            iObjectWrapperR = zzpVarH.z1(new ObjectWrapper(context), str, i3);
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                            iObjectWrapperR = zzpVarH.r(new ObjectWrapper(context), str, i3);
                                                        }
                                                        objZ1 = ObjectWrapper.z1(iObjectWrapperR);
                                                        if (objZ1 != null) {
                                                            throw new LoadingException("Failed to load remote module.", null);
                                                        }
                                                        dynamiteModule = new DynamiteModule((Context) objZ1);
                                                    }
                                                    if (jLongValue == 0) {
                                                        l.remove();
                                                    } else {
                                                        l.set(l2);
                                                    }
                                                    cursor = q35Var4.a;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    k.set(q35Var3);
                                                    return dynamiteModule;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    throw th;
                                                }
                                            }
                                        } catch (RemoteException e2) {
                                            e = e2;
                                            throw new LoadingException("Failed to load remote module.", e, null);
                                        } catch (LoadingException e3) {
                                            throw e3;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r8 = gl0Var;
                                            CrashUtils.addDynamiteErrorToDropBox(r8, th);
                                            throw new LoadingException("Failed to load remote module.", th, null);
                                        }
                                    } catch (RemoteException e4) {
                                        e = e4;
                                        throw new LoadingException("Failed to load remote module.", e, null);
                                    } catch (LoadingException e5) {
                                        throw e5;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        r8 = context;
                                        CrashUtils.addDynamiteErrorToDropBox(r8, th);
                                        throw new LoadingException("Failed to load remote module.", th, null);
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (LoadingException e6) {
                                e = e6;
                                r7 = gl0Var;
                                String message = e.getMessage();
                                StringBuilder sb5 = new StringBuilder(String.valueOf(message).length() + 30);
                                sb5.append("Failed to load remote module: ");
                                sb5.append(message);
                                Log.w("DynamiteModule", sb5.toString());
                                i2 = selectionResultA.a;
                                if (i2 != 0) {
                                }
                                throw new LoadingException("Remote load failed. No local fallback found.", e, null);
                            }
                        } catch (LoadingException e7) {
                            e = e7;
                            r7 = context;
                            String message2 = e.getMessage();
                            StringBuilder sb6 = new StringBuilder(String.valueOf(message2).length() + 30);
                            sb6.append("Failed to load remote module: ");
                            sb6.append(message2);
                            Log.w("DynamiteModule", sb6.toString());
                            i2 = selectionResultA.a;
                            if (i2 != 0 || versionPolicy.a(r7, str, new f(i2)).c != -1) {
                                throw new LoadingException("Remote load failed. No local fallback found.", e, null);
                            }
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            dynamiteModule = new DynamiteModule(applicationContext);
                        }
                    }
                } else if (selectionResultA.a != 0) {
                    i7 = -1;
                    if (i7 == 1) {
                    }
                    if (i7 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                        DynamiteModule dynamiteModule3 = new DynamiteModule(applicationContext);
                        if (jLongValue == 0) {
                            gl0Var.remove();
                        } else {
                            gl0Var.set(l2);
                        }
                        cursor2 = q35Var4.a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(q35Var3);
                        return dynamiteModule3;
                    }
                    if (i7 == 1) {
                        StringBuilder sb7 = new StringBuilder(String.valueOf(i7).length() + 36);
                        sb7.append("VersionPolicy returned invalid code:");
                        sb7.append(i7);
                        throw new LoadingException(sb7.toString(), null);
                    }
                    i3 = selectionResultA.b;
                    synchronized (DynamiteModule.class) {
                        if (e(context)) {
                            throw new LoadingException("Remote loading disabled", null);
                        }
                        bool = f;
                        if (bool != null) {
                            throw new LoadingException("Failed to determine which loading route to use.", null);
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb8 = new StringBuilder(str.length() + 40 + String.valueOf(i3).length());
                            sb8.append("Selected remote version of ");
                            sb8.append(str);
                            sb8.append(", version >= ");
                            sb8.append(i3);
                            Log.i("DynamiteModule", sb8.toString());
                            synchronized (DynamiteModule.class) {
                                zzqVar = o;
                                if (zzqVar != null) {
                                    throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                }
                                q35Var2 = (q35) threadLocal.get();
                                if (q35Var2 != null) {
                                }
                                throw new LoadingException("No result cursor", null);
                            }
                        }
                        StringBuilder sb9 = new StringBuilder(str.length() + 40 + String.valueOf(i3).length());
                        sb9.append("Selected remote version of ");
                        sb9.append(str);
                        sb9.append(", version >= ");
                        sb9.append(i3);
                        Log.i("DynamiteModule", sb9.toString());
                        zzpVarH = h(context);
                        if (zzpVarH != null) {
                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                        }
                        Parcel parcelZzB2 = zzpVarH.zzB(6, zzpVarH.zza());
                        i4 = parcelZzB2.readInt();
                        parcelZzB2.recycle();
                        if (i4 >= 3) {
                            q35Var = (q35) threadLocal.get();
                            if (q35Var != null) {
                                throw new LoadingException("No cached result cursor holder", null);
                            }
                            iObjectWrapperR = zzpVarH.A1(new ObjectWrapper(context), str, i3, new ObjectWrapper(q35Var.a));
                        } else if (i4 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            iObjectWrapperR = zzpVarH.z1(new ObjectWrapper(context), str, i3);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            iObjectWrapperR = zzpVarH.r(new ObjectWrapper(context), str, i3);
                        }
                        objZ1 = ObjectWrapper.z1(iObjectWrapperR);
                        if (objZ1 != null) {
                            throw new LoadingException("Failed to load remote module.", null);
                        }
                        dynamiteModule = new DynamiteModule((Context) objZ1);
                        if (jLongValue == 0) {
                            l.remove();
                        } else {
                            l.set(l2);
                        }
                        cursor = q35Var4.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        k.set(q35Var3);
                        return dynamiteModule;
                    }
                }
            }
            int i8 = selectionResultA.a;
            int i9 = selectionResultA.b;
            StringBuilder sb10 = new StringBuilder(str.length() + 46 + String.valueOf(i8).length() + 23 + String.valueOf(i9).length() + 1);
            sb10.append("No acceptable module ");
            sb10.append(str);
            sb10.append(" found. Local version is ");
            sb10.append(i8);
            sb10.append(" and remote version is ");
            sb10.append(i9);
            sb10.append(UserDetailsUtils.UserDetailsLiterals.DOT);
            throw new LoadingException(sb10.toString(), null);
        } catch (Throwable th5) {
            if (jLongValue == 0) {
                l.remove();
            } else {
                l.set(l2);
            }
            Cursor cursor4 = q35Var4.a;
            if (cursor4 != null) {
                cursor4.close();
            }
            k.set(q35Var3);
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b3 A[Catch: all -> 0x003b, TryCatch #11 {all -> 0x003b, blocks: (B:10:0x002b, B:12:0x0037, B:52:0x00bc, B:17:0x0040, B:19:0x0047, B:21:0x004d, B:26:0x0053, B:28:0x0057, B:31:0x0060, B:33:0x0068, B:36:0x006f, B:43:0x009b, B:44:0x00a3, B:39:0x0076, B:41:0x007c, B:42:0x008d, B:47:0x00a6, B:50:0x00a9, B:51:0x00b3, B:18:0x0043), top: B:144:0x002b, inners: #12 }] */
    public static int d(Context context, String str, boolean z) {
        Throwable th;
        RemoteException e2;
        int i2;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f;
                boolean z2 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        g(classLoader);
                                    } catch (LoadingException unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!e(context)) {
                                        return 0;
                                    }
                                    if (h) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iF = f(context, str, z, true);
                                                String str2 = g;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderA = zzb.a();
                                                    if (classLoaderA == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            c7.d();
                                                            String str3 = g;
                                                            Preconditions.checkNotNull(str3);
                                                            classLoaderA = c7.b(ClassLoader.getSystemClassLoader(), str3);
                                                        } else {
                                                            String str4 = g;
                                                            Preconditions.checkNotNull(str4);
                                                            classLoaderA = new h74(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    g(classLoaderA);
                                                    declaredField.set(null, classLoaderA);
                                                    f = bool2;
                                                    return iF;
                                                }
                                                return iF;
                                            } catch (LoadingException unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        String string = e3.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(string);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, str, z, false);
                    } catch (LoadingException e4) {
                        String message = e4.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        Log.w("DynamiteModule", sb2.toString());
                        return 0;
                    }
                }
                zzp zzpVarH = h(context);
                try {
                    if (zzpVarH == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelZzB = zzpVarH.zzB(6, zzpVarH.zza());
                        int i3 = parcelZzB.readInt();
                        parcelZzB.recycle();
                        if (i3 >= 3) {
                            ThreadLocal threadLocal = k;
                            q35 q35Var = (q35) threadLocal.get();
                            if (q35Var != null && (cursor = q35Var.a) != null) {
                                return cursor.getInt(0);
                            }
                            ObjectWrapper objectWrapper = new ObjectWrapper(context);
                            long jLongValue = ((Long) l.get()).longValue();
                            Parcel parcelZza = zzpVarH.zza();
                            zzc.d(parcelZza, objectWrapper);
                            parcelZza.writeString(str);
                            parcelZza.writeInt(z ? 1 : 0);
                            parcelZza.writeLong(jLongValue);
                            Cursor cursor3 = (Cursor) ObjectWrapper.z1(rl3.h(zzpVarH.zzB(7, parcelZza)));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i2 = cursor3.getInt(0);
                                        if (i2 > 0) {
                                            q35 q35Var2 = (q35) threadLocal.get();
                                            if (q35Var2 == null || q35Var2.a != null) {
                                                z2 = false;
                                            } else {
                                                q35Var2.a = cursor3;
                                            }
                                            cursor2 = z2 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e5) {
                                    e2 = e5;
                                    cursor2 = cursor3;
                                    String message2 = e2.getMessage();
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 42);
                                    sb3.append("Failed to retrieve remote module version: ");
                                    sb3.append(message2);
                                    Log.w("DynamiteModule", sb3.toString());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i3 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            ObjectWrapper objectWrapper2 = new ObjectWrapper(context);
                            Parcel parcelZza2 = zzpVarH.zza();
                            zzc.d(parcelZza2, objectWrapper2);
                            parcelZza2.writeString(str);
                            parcelZza2.writeInt(z ? 1 : 0);
                            Parcel parcelZzB2 = zzpVarH.zzB(5, parcelZza2);
                            i2 = parcelZzB2.readInt();
                            parcelZzB2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            ObjectWrapper objectWrapper3 = new ObjectWrapper(context);
                            Parcel parcelZza3 = zzpVarH.zza();
                            zzc.d(parcelZza3, objectWrapper3);
                            parcelZza3.writeString(str);
                            parcelZza3.writeInt(z ? 1 : 0);
                            Parcel parcelZzB3 = zzpVarH.zzB(3, parcelZza3);
                            i2 = parcelZzB3.readInt();
                            parcelZzB3.recycle();
                        }
                        return i2;
                    } catch (RemoteException e6) {
                        e2 = e6;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            CrashUtils.addDynamiteErrorToDropBox(context, th5);
            throw th5;
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(j)) {
            return true;
        }
        boolean z = false;
        if (j == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != PlatformVersion.isAtLeastQ() ? 0 : 268435456);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            j = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                h = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0190 A[Catch: all -> 0x0157, TryCatch #4 {all -> 0x0157, blocks: (B:59:0x00ef, B:62:0x00f7, B:65:0x00ff, B:80:0x012e, B:82:0x0138, B:84:0x013c, B:93:0x0149, B:97:0x014f, B:98:0x0156, B:105:0x0163, B:115:0x017a, B:116:0x0188, B:118:0x018a, B:120:0x018c, B:122:0x0190, B:123:0x01b2, B:124:0x01b3), top: B:135:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x01b3 A[Catch: all -> 0x0157, TRY_LEAVE, TryCatch #4 {all -> 0x0157, blocks: (B:59:0x00ef, B:62:0x00f7, B:65:0x00ff, B:80:0x012e, B:82:0x0138, B:84:0x013c, B:93:0x0149, B:97:0x014f, B:98:0x0156, B:105:0x0163, B:115:0x017a, B:116:0x0188, B:118:0x018a, B:120:0x018c, B:122:0x0190, B:123:0x01b2, B:124:0x01b3), top: B:135:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:148:? A[SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0159: MOVE (r2 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:346), block:B:100:0x0158 */
    public static int f(Context context, String str, boolean z, boolean z2) throws Throwable {
        Throwable th;
        Exception exc;
        Cursor cursor;
        MatrixCursor matrixCursor;
        boolean z3;
        Cursor cursor2 = null;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        try {
            try {
                boolean z4 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) l.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z5 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i2 = 0; i2 < count; i2++) {
                                    if (!cursorQuery.moveToPosition(i2)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i3 = 0; i3 < columnCount; i3++) {
                                        int type = cursorQuery.getType(i3);
                                        if (type == 0) {
                                            objArr[i3] = null;
                                        } else if (type == 1) {
                                            objArr[i3] = Long.valueOf(cursorQuery.getLong(i3));
                                        } else if (type == 2) {
                                            objArr[i3] = Double.valueOf(cursorQuery.getDouble(i3));
                                        } else if (type == 3) {
                                            objArr[i3] = cursorQuery.getString(i3);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i3] = cursorQuery.getBlob(i3);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i4 = matrixCursor.getInt(0);
                            if (i4 > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        g = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            i = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z3 = matrixCursor.getInt(columnIndex2) != 0;
                                            h = z3;
                                        } else {
                                            z3 = false;
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                                q35 q35Var = (q35) k.get();
                                if (q35Var == null || q35Var.a != null) {
                                    z4 = false;
                                } else {
                                    q35Var.a = matrixCursor;
                                }
                                z5 = z3;
                                if (z4) {
                                    matrixCursor = null;
                                }
                            }
                            if (z2 && z5) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl", b3 == true ? 1 : 0);
                            }
                            if (matrixCursor != null) {
                                matrixCursor.close();
                            }
                            return i4;
                        }
                    } catch (Exception e2) {
                        exc = e2;
                        if (!(exc instanceof LoadingException)) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                        sb.append("V2 version check failed: ");
                        sb.append(message);
                        throw new LoadingException(sb.toString(), exc, b2 == true ? 1 : 0);
                    }
                }
                synchronized (DynamiteModule.class) {
                    if (matrixCursor == null) {
                        try {
                            if (Boolean.FALSE.equals(null)) {
                                Log.w("DynamiteModule", "Play services is unavailable. Will not fall back to container v1 loader.");
                                return 0;
                            }
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                    throw new LoadingException("Failed to connect to dynamite module ContentResolver.", b4 == true ? 1 : 0);
                }
            } catch (Exception e3) {
                exc = e3;
                if (!(exc instanceof LoadingException)) {
                    throw exc;
                }
                String message2 = exc.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 25);
                sb2.append("V2 version check failed: ");
                sb2.append(message2);
                throw new LoadingException(sb2.toString(), exc, b2 == true ? 1 : 0);
            } catch (Throwable th7) {
                th = th7;
                if (cursor2 != null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            cursor2 = cursor;
            if (cursor2 != null) {
                throw th;
            }
            cursor2.close();
            throw th;
        }
    }

    public static void g(ClassLoader classLoader) throws LoadingException {
        zzq zzqVar;
        byte[] bArr = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                zzqVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }
            o = zzqVar;
        } catch (ClassNotFoundException e2) {
            e = e2;
            throw new LoadingException("Failed to instantiate dynamite loader", e, bArr);
        } catch (IllegalAccessException e3) {
            e = e3;
            throw new LoadingException("Failed to instantiate dynamite loader", e, bArr);
        } catch (InstantiationException e4) {
            e = e4;
            throw new LoadingException("Failed to instantiate dynamite loader", e, bArr);
        } catch (NoSuchMethodException e5) {
            e = e5;
            throw new LoadingException("Failed to instantiate dynamite loader", e, bArr);
        } catch (InvocationTargetException e6) {
            e = e6;
            throw new LoadingException("Failed to instantiate dynamite loader", e, bArr);
        }
    }

    public static zzp h(Context context) {
        zzp zzpVar;
        synchronized (DynamiteModule.class) {
            zzp zzpVar2 = n;
            if (zzpVar2 != null) {
                return zzpVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzpVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzpVar = iInterfaceQueryLocalInterface instanceof zzp ? (zzp) iInterfaceQueryLocalInterface : new zzp(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                }
                if (zzpVar != null) {
                    n = zzpVar;
                    return zzpVar;
                }
            } catch (Exception e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) throws LoadingException {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e2, null);
        }
    }

    public DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.a = context;
    }
}
