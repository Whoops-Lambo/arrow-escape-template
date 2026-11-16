package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class bp1 {
    public static final nm a;
    public static final nm b;

    static {
        byte[] bArrJ = nd4.j("\r\n", er.a);
        a = new nm(bArrJ, 0, bArrJ.length);
        b = new nm(new byte[]{45, 45});
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0198  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ac, code lost:
    
        if (r3.d(r6) == r10) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.nm r27, defpackage.jz r28, defpackage.kl r29, defpackage.ry0 r30, long r31, defpackage.fy r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp1.a(nm, jz, kl, ry0, long, fy):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0076 A[LOOP:0: B:35:0x0074->B:36:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(jz jzVar, fy fyVar) throws Throwable {
        zo1 zo1Var;
        Throwable th;
        nq nqVar;
        ur1 ur1Var;
        ArrayList arrayList;
        char[] cArr;
        int size;
        int i;
        if (fyVar instanceof zo1) {
            zo1Var = (zo1) fyVar;
            int i2 = zo1Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zo1Var.t = i2 - Integer.MIN_VALUE;
            } else {
                zo1Var = new zo1(fyVar);
            }
        } else {
            zo1Var = new zo1(fyVar);
        }
        Object obj = zo1Var.s;
        int i3 = zo1Var.t;
        if (i3 == 0) {
            wz2.a0(obj);
            nq nqVar2 = new nq();
            try {
                zo1Var.r = nqVar2;
                zo1Var.t = 1;
                Set set = yy0.a;
                m12 m12Var = new m12((byte) 0, 1);
                m12Var.b = 0;
                m12Var.c = 0;
                Object objC = yy0.c(jzVar, nqVar2, m12Var, zo1Var);
                dz dzVar = dz.a;
                if (objC == dzVar) {
                    return dzVar;
                }
                obj = objC;
                nqVar = nqVar2;
            } catch (Throwable th2) {
                th = th2;
                nqVar = nqVar2;
                ur1Var = nqVar.a;
                arrayList = nqVar.b;
                if (arrayList != null) {
                    nqVar.c = null;
                    size = arrayList.size();
                    for (i = 0; i < size; i++) {
                        ur1Var.E(arrayList.get(i));
                    }
                } else {
                    cArr = nqVar.c;
                    if (cArr != null) {
                        ur1Var.E(cArr);
                    }
                    nqVar.c = null;
                }
                nqVar.e = true;
                nqVar.b = null;
                nqVar.d = null;
                nqVar.g = 0;
                nqVar.f = 0;
                throw th;
            }
        } else {
            if (i3 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nqVar = zo1Var.r;
            try {
                wz2.a0(obj);
            } catch (Throwable th3) {
                th = th3;
                ur1Var = nqVar.a;
                arrayList = nqVar.b;
                if (arrayList != null) {
                    nqVar.c = null;
                    size = arrayList.size();
                    while (i < size) {
                        ur1Var.E(arrayList.get(i));
                    }
                } else {
                    cArr = nqVar.c;
                    if (cArr != null) {
                        ur1Var.E(cArr);
                    }
                    nqVar.c = null;
                }
                nqVar.e = true;
                nqVar.b = null;
                nqVar.d = null;
                nqVar.g = 0;
                nqVar.f = 0;
                throw th;
            }
        }
        ry0 ry0Var = (ry0) obj;
        if (ry0Var != null) {
            return ry0Var;
        }
        throw new EOFException("Failed to parse multipart headers: unexpected end of stream");
    }

    public static final void c(k32 k32Var, byte[] bArr, byte b2) throws IOException {
        int i = k32Var.a;
        if (i >= bArr.length) {
            dr0.h("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
        } else {
            k32Var.a = i + 1;
            bArr[i] = b2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(rl rlVar, nm nmVar, fy fyVar) {
        ap1 ap1Var;
        if (fyVar instanceof ap1) {
            ap1Var = (ap1) fyVar;
            int i = ap1Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                ap1Var.t = i - Integer.MIN_VALUE;
            } else {
                ap1Var = new ap1(fyVar);
            }
        } else {
            ap1Var = new ap1(fyVar);
        }
        Object objC = ap1Var.s;
        int i2 = ap1Var.t;
        if (i2 == 0) {
            wz2.a0(objC);
            ap1Var.r = nmVar;
            ap1Var.t = 1;
            objC = l7.C(rlVar, nmVar, ap1Var);
            dz dzVar = dz.a;
            if (objC == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nmVar = ap1Var.r;
            wz2.a0(objC);
        }
        return new Long(((Boolean) objC).booleanValue() ? nmVar.a.length : 0L);
    }
}
