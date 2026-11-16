package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.internal.measurement.zzjx;
import com.google.android.gms.internal.measurement.zzkk;
import com.google.android.gms.internal.measurement.zzlf;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzlw;
import com.google.android.gms.internal.measurement.zzmn;
import com.google.android.gms.internal.measurement.zzqi;
import com.google.android.gms.internal.measurement.zzrw;
import com.google.android.gms.internal.measurement.zzrx;
import com.google.android.gms.internal.measurement.zzsd;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u15 implements ol2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ u15(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    /* JADX WARN: Type inference failed for: r10v12, types: [s15] */
    /* JADX WARN: Type inference failed for: r10v7, types: [s15] */
    @Override // defpackage.ol2
    public final Object get() {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                Object obj = zzlk.j;
                final zzlj zzljVar = new zzlj();
                zzljVar.a = context;
                context.getClass();
                if (zzljVar.b == null) {
                    zzljVar.b = zzlk.m;
                }
                final int i2 = 1;
                if (zzljVar.c == null) {
                    zzljVar.c = uu.F(new u15(zzljVar.a, i2));
                }
                if (zzljVar.d == null) {
                    zzljVar.d = new ol2() { // from class: s15
                        @Override // defpackage.ol2
                        public final Object get() {
                            int i3 = i2;
                            zzlj zzljVar2 = zzljVar;
                            switch (i3) {
                                case 0:
                                    Context context2 = zzljVar2.a;
                                    Object obj2 = zzlk.j;
                                    try {
                                        ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new py1(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return c0.a;
                                    }
                                default:
                                    return new py1(new zzqi(zzljVar2.b));
                            }
                        }
                    };
                }
                final int i3 = 0;
                if (zzljVar.e == null) {
                    Context context2 = zzljVar.a;
                    ArrayList arrayList = new ArrayList();
                    Collections.addAll(arrayList, new zzrx(new zzrw(context2)), new zzsd());
                    zzljVar.e = uu.F(new x15(arrayList, i3));
                }
                if (zzljVar.f == null) {
                    zzljVar.f = new ol2() { // from class: s15
                        @Override // defpackage.ol2
                        public final Object get() {
                            int i4 = i3;
                            zzlj zzljVar2 = zzljVar;
                            switch (i4) {
                                case 0:
                                    Context context3 = zzljVar2.a;
                                    Object obj2 = zzlk.j;
                                    try {
                                        ApplicationInfo applicationInfo = context3.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new py1(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return c0.a;
                                    }
                                default:
                                    return new py1(new zzqi(zzljVar2.b));
                            }
                        }
                    };
                }
                return new zzlk(zzljVar.a, zzljVar.b, zzljVar.c, zzljVar.d, zzljVar.e, zzljVar.f);
            case 1:
                Object obj2 = zzlk.j;
                Api api = zzjx.a;
                return new zzmn(new zzkk(context, zzjx.a, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS));
            default:
                Object obj3 = zzlw.a;
                return zzlf.a(context);
        }
    }
}
