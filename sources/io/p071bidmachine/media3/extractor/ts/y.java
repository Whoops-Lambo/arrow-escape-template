package io.p071bidmachine.media3.extractor.ts;

import android.content.ContentResolver;
import android.os.RemoteException;
import android.provider.Settings;
import androidx.arch.core.util.Function;
import com.applovin.impl.m5;
import com.applovin.impl.o3;
import com.applovin.impl.sdk.m;
import com.applovin.impl.w3;
import com.applovin.impl.y3;
import com.facebook.appevents.t;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.google.android.gms.internal.ads.zziht;
import com.google.android.gms.internal.ads.zzihu;
import com.google.android.gms.internal.measurement.zzaeg;
import com.google.android.gms.internal.play_billing.zzgc;
import com.google.android.recaptcha.internal.zzce;
import com.vungle.ads.internal.util.n;
import defpackage.d31;
import defpackage.y32;
import defpackage.z21;
import io.p071bidmachine.media3.common.util.v;
import io.p071bidmachine.media3.extractor.p;
import io.p071bidmachine.media3.extractor.text.k;
import io.p071bidmachine.media3.extractor.wav.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class y implements p, m.d, com.vungle.ads.internal.util.m, Function, w3.b {
    public final /* synthetic */ int a;

    public /* synthetic */ y(int i) {
        this.a = i;
    }

    public static /* synthetic */ void b() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void c(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }

    public static /* synthetic */ void d(int i, int i2, Object obj) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void e(int i, int i2, Throwable th) throws zzce {
        throw new zzce(i, i2, th);
    }

    public static /* synthetic */ void f(int i, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) "#read(byte[]) returned invalid result: ");
        sb.append(i);
        sb.append((Object) "\nThe InputStream implementation is buggy.");
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void g(int i, Object obj, Object obj2, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(i);
        sb.append((Object) " parameters found ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void h(Object obj, Object obj2, Throwable th) {
        throw new RuntimeException("Generated message class \"" + obj + ((Object) "\" missing method \"") + obj2 + ((Object) "\"."), th);
    }

    public static /* synthetic */ void i(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void j(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void k(String str, float f, Object obj, float f2, Object obj2) {
        throw new IllegalArgumentException(str + f + obj + f2 + obj2);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(String str, Throwable th) throws GeneralSecurityException {
        throw new GeneralSecurityException(str, th);
    }

    public static /* synthetic */ void o() {
        throw new AssertionError();
    }

    public static /* synthetic */ void p(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void q() throws zzaeg {
        throw new zzaeg("Protocol message tag had invalid wire type.");
    }

    public static /* synthetic */ void r(String str) throws r {
        throw new r(str);
    }

    public static /* synthetic */ void s() throws RemoteException {
        throw new RemoteException();
    }

    public static /* synthetic */ void t(String str) throws zzgc {
        throw new zzgc(str);
    }

    public static /* synthetic */ void u() throws zziht {
        throw new zziht("Protocol message tag had invalid wire type.");
    }

    public static /* synthetic */ void v(String str) throws zzihu {
        throw new zzihu(str);
    }

    @Override // com.applovin.impl.sdk.m.d
    public String a(ContentResolver contentResolver, String str) {
        switch (this.a) {
            case 7:
                return Settings.System.getString(contentResolver, str);
            case 8:
                return Settings.Secure.getString(contentResolver, str);
            default:
                return Settings.Global.getString(contentResolver, str);
        }
    }

    @Override // androidx.arch.core.util.Function
    public Object apply(Object obj) {
        return o3.a((m5) obj);
    }

    @Override // io.p071bidmachine.media3.extractor.p
    public io.p071bidmachine.media3.extractor.m[] createExtractors() {
        switch (this.a) {
            case 0:
                return new io.p071bidmachine.media3.extractor.m[]{new a0()};
            case 1:
                v vVar = new v(0L);
                z21 z21Var = d31.b;
                return new io.p071bidmachine.media3.extractor.m[]{new d0(1, 1, k.q9, vVar, new t(0, y32.e))};
            default:
                return new io.p071bidmachine.media3.extractor.m[]{new d()};
        }
    }

    public static /* synthetic */ void n(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.applovin.impl.w3.b
    public Object a(Object obj) {
        return y3.a((Long) obj);
    }

    @Override // com.vungle.ads.internal.util.m
    public ObjectInputStream a(InputStream inputStream) {
        return n.a(inputStream);
    }
}
