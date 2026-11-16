package defpackage;

import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class r91 {
    public static final q91 d = new q91(new z91(false, false, false, false, false, true, "    ", false, "type", true, ur.b), ka2.a);
    public final z91 a;
    public final ja2 b;
    public final tb0 c = new tb0(0);

    public r91(z91 z91Var, ja2 ja2Var) {
        this.a = z91Var;
        this.b = ja2Var;
    }

    public final Object a(String str, KSerializer kSerializer) {
        kSerializer.getClass();
        str.getClass();
        vj2 vj2Var = new vj2(str);
        Object objZ = new pj2(this, v83.OBJ, vj2Var, kSerializer.getDescriptor(), null).z(kSerializer);
        vj2Var.o();
        return objZ;
    }

    public final String b(KSerializer kSerializer, Object obj) {
        dw dwVar;
        kSerializer.getClass();
        uo0 uo0Var = new uo0(1, false);
        uo0Var.c = oq.d.b(128);
        try {
            v83 v83Var = v83.OBJ;
            na1[] na1VarArr = new na1[v83.h.size()];
            if (this.a.e) {
                dwVar = new gw(uo0Var, this);
            } else {
                dwVar = new dw(uo0Var);
            }
            new qj2(dwVar, this, v83Var, na1VarArr).y(kSerializer, obj);
            return uo0Var.toString();
        } finally {
            oq oqVar = oq.d;
            char[] cArr = (char[]) uo0Var.c;
            oqVar.getClass();
            cArr.getClass();
            oqVar.a(cArr);
        }
    }
}
