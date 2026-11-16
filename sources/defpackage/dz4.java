package defpackage;

import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.recaptcha.internal.zznm;
import com.google.android.recaptcha.internal.zznn;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dz4 {
    public static /* synthetic */ void a() throws zznm {
        throw new zznm("Protocol message tag had invalid wire type.");
    }

    public static /* synthetic */ void b(int i, int i2, Object obj) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "Source subfield ");
        sb.append(i2);
        sb.append((Object) " is present but null: ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void c(int i, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void d(String str) throws zznn {
        throw new zznn(str);
    }

    public static /* synthetic */ void e(String str, long j, Object obj, int i, Object obj2) {
        throw new IllegalArgumentException(str + j + obj + i + obj2);
    }

    public static /* synthetic */ void f(String str) throws zzaeh {
        throw new zzaeh(str);
    }
}
