package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzayj;
import com.google.android.gms.internal.ads.zzazk;
import com.google.android.gms.internal.ads.zzazv;
import com.google.android.gms.internal.ads.zzgfx;
import com.google.android.gms.internal.ads.zzgko;
import com.google.android.gms.internal.ads.zzglw;
import com.google.android.gms.internal.ads.zzgsw;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class jm4 extends zzglw {
    public final /* synthetic */ int f = 0;
    public final Object g;

    public jm4(zzayj zzayjVar, zzgko zzgkoVar, Context context, zzgsw zzgswVar) {
        super("cvLOBQjS+NNcDN0BMHTMw2kgSh7D0xH8xQUNcjoEhafXaafm0kxkj1eABekgW7gS", "//iHdvX+jWtTSFmMTH29fLyV4n+m0b019C+AOebz3cw=", zzayjVar, zzgkoVar, zzgswVar.a(Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE));
        this.g = context;
    }

    @Override // com.google.android.gms.internal.ads.zzglw
    public final void a(Method method, zzayj zzayjVar) {
        switch (this.f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", (Context) this.g);
                objArr.getClass();
                synchronized (zzayjVar) {
                    try {
                        long jIntValue = ((Integer) objArr[0]).intValue();
                        zzayjVar.l();
                        ((zzazk) zzayjVar.b).i0(jIntValue);
                        long jIntValue2 = ((Integer) objArr[1]).intValue();
                        zzayjVar.l();
                        ((zzazk) zzayjVar.b).S0(jIntValue2);
                        long jIntValue3 = ((Integer) objArr[2]).intValue();
                        zzayjVar.l();
                        ((zzazk) zzayjVar.b).T0(jIntValue3);
                        long jIntValue4 = ((Integer) objArr[3]).intValue();
                        zzayjVar.l();
                        ((zzazk) zzayjVar.b).z0(jIntValue4);
                        Boolean bool = (Boolean) objArr[4];
                        if (bool == null) {
                            zzazv zzazvVar = zzazv.ENUM_FAILURE;
                            zzayjVar.l();
                            ((zzazk) zzayjVar.b).X(zzazvVar);
                        } else {
                            zzazv zzazvVar2 = bool.booleanValue() ? zzazv.ENUM_TRUE : zzazv.ENUM_FALSE;
                            zzayjVar.l();
                            ((zzazk) zzayjVar.b).X(zzazvVar2);
                        }
                        Boolean bool2 = (Boolean) objArr[5];
                        if (bool2 == null) {
                            zzayjVar.o(zzazv.ENUM_FAILURE);
                        } else {
                            zzayjVar.o(bool2.booleanValue() ? zzazv.ENUM_TRUE : zzazv.ENUM_FALSE);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                Object[] objArr2 = (Object[]) method.invoke("", ((zzgfx) this.g).Z());
                objArr2.getClass();
                synchronized (zzayjVar) {
                    String str = (String) objArr2[0];
                    zzayjVar.l();
                    ((zzazk) zzayjVar.b).Q0(str);
                    String str2 = (String) objArr2[1];
                    zzayjVar.l();
                    ((zzazk) zzayjVar.b).x0(str2);
                    break;
                }
                return;
        }
    }

    public jm4(zzayj zzayjVar, zzgko zzgkoVar, zzgfx zzgfxVar, zzgsw zzgswVar) {
        super("ArAxZLR2ClYTRfrFtS5JWp8P4plPN4/dY7owCYt/AAsuWgW1cXT8x9EzMBASywXs", "3DBHKWVTYL/MWwYC53wcKZpqFt/vGpwyZfirM9Xf3v8=", zzayjVar, zzgkoVar, zzgswVar.a(116));
        this.g = zzgfxVar;
    }
}
