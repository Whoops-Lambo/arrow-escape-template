package defpackage;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dn0 implements zr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zr0 b;

    public /* synthetic */ dn0(zr0 zr0Var, int i) {
        this.a = i;
        this.b = zr0Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) throws qo2 {
        Long lValueOf;
        sw0 sw0VarA;
        Long lN;
        int i = this.a;
        zr0 zr0Var = this.b;
        switch (i) {
            case 0:
                File file = (File) obj;
                IOException iOException = (IOException) obj2;
                file.getClass();
                iOException.getClass();
                if (zr0Var.invoke(file, iOException) != js1.a) {
                    return az2.a;
                }
                throw new qo2(file);
            default:
                j01 j01Var = (j01) obj;
                Integer num = (Integer) obj2;
                num.getClass();
                j01Var.getClass();
                d01 d01Var = j01Var.a;
                if (d01Var == null || (sw0VarA = d01Var.a()) == null) {
                    lValueOf = null;
                } else {
                    List list = qy0.a;
                    String str = sw0VarA.get(CommonGatewayClient.HEADER_RETRY_AFTER);
                    if (str == null || (lN = kk2.N(str)) == null) {
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(lN.longValue() * 1000);
                    }
                }
                return Long.valueOf(Math.max(((Number) zr0Var.invoke(j01Var, num)).longValue(), lValueOf != null ? lValueOf.longValue() : 0L));
        }
    }
}
