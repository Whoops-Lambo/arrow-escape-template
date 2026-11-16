package defpackage;

import com.google.android.gms.internal.fido.zzfv;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class tb1 implements zzfv {
    public int a;
    public boolean b;
    public Object c;

    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(tb1 tb1Var, b60 b60Var, ph phVar) {
        sb1 sb1Var;
        byte bG;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        tb1 tb1Var2;
        byte bF;
        g1 g1Var;
        g1 g1Var2 = (g1) tb1Var.c;
        if (phVar instanceof sb1) {
            sb1Var = (sb1) phVar;
            int i = sb1Var.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                sb1Var.x = i - Integer.MIN_VALUE;
            } else {
                sb1Var = new sb1(tb1Var, phVar);
            }
        } else {
            sb1Var = new sb1(tb1Var, phVar);
        }
        Object obj = sb1Var.v;
        int i2 = sb1Var.x;
        if (i2 != 0) {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str = sb1Var.u;
            linkedHashMap2 = sb1Var.t;
            tb1Var2 = sb1Var.s;
            b60 b60Var2 = sb1Var.r;
            wz2.a0(obj);
            linkedHashMap2.put(str, (b) obj);
            bF = ((g1) tb1Var2.c).f();
            if (bF == 4) {
                bG = bF;
                tb1Var = tb1Var2;
                linkedHashMap = linkedHashMap2;
                b60Var = b60Var2;
            } else if (bF != 7) {
                g1.q((g1) tb1Var2.c, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            g1Var = (g1) tb1Var2.c;
            if (bF == 6) {
                g1Var.g((byte) 7);
            } else if (bF == 4) {
                os2.u(g1Var, "object");
                throw null;
            }
            return new c(linkedHashMap2);
        }
        wz2.a0(obj);
        bG = g1Var2.g((byte) 6);
        if (g1Var2.w() == 4) {
            g1.q(g1Var2, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        g1 g1Var3 = (g1) tb1Var.c;
        if (g1Var3.c()) {
            String strL = tb1Var.b ? g1Var3.l() : g1Var3.j();
            g1Var3.g((byte) 5);
            sb1Var.r = b60Var;
            sb1Var.s = tb1Var;
            sb1Var.t = linkedHashMap;
            sb1Var.u = strL;
            sb1Var.x = 1;
            b60Var.getClass();
            b60Var.b = sb1Var;
            return dz.a;
        }
        linkedHashMap2 = linkedHashMap;
        tb1Var2 = tb1Var;
        bF = bG;
        g1Var = (g1) tb1Var2.c;
        if (bF == 6) {
            g1Var.g((byte) 7);
        } else if (bF == 4) {
            os2.u(g1Var, "object");
            throw null;
        }
        return new c(linkedHashMap2);
    }

    public b b() {
        b cVar;
        Object obj;
        g1 g1Var = (g1) this.c;
        byte bW = g1Var.w();
        if (bW == 1) {
            return d(true);
        }
        if (bW == 0) {
            return d(false);
        }
        if (bW != 6) {
            if (bW == 8) {
                return c();
            }
            g1.q(g1Var, "Cannot read Json element because of unexpected ".concat(at.B(bW)), 0, null, 6);
            throw null;
        }
        int i = this.a + 1;
        this.a = i;
        if (i == 200) {
            rb1 rb1Var = new rb1(this, null);
            b60 b60Var = new b60();
            b60Var.a = rb1Var;
            b60Var.b = b60Var;
            dz dzVar = ep0.a;
            b60Var.c = dzVar;
            while (true) {
                obj = b60Var.c;
                dy dyVar = b60Var.b;
                if (dyVar == null) {
                    break;
                }
                if (s71.b(dzVar, obj)) {
                    try {
                        rb1 rb1Var2 = b60Var.a;
                        os2.j(3, rb1Var2);
                        rb1 rb1Var3 = new rb1(rb1Var2.t, dyVar);
                        rb1Var3.s = b60Var;
                        Object objInvokeSuspend = rb1Var3.invokeSuspend(az2.a);
                        if (objInvokeSuspend != dz.a) {
                            dyVar.resumeWith(objInvokeSuspend);
                        }
                    } catch (Throwable th) {
                        dyVar.resumeWith(new j52(th));
                    }
                } else {
                    b60Var.c = dzVar;
                    dyVar.resumeWith(obj);
                }
            }
            wz2.a0(obj);
            cVar = (b) obj;
        } else {
            byte bG = g1Var.g((byte) 6);
            if (g1Var.w() == 4) {
                g1.q(g1Var, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (g1Var.c()) {
                String strL = this.b ? g1Var.l() : g1Var.j();
                g1Var.g((byte) 5);
                linkedHashMap.put(strL, b());
                bG = g1Var.f();
                if (bG != 4) {
                    if (bG == 7) {
                        break;
                    }
                    g1.q(g1Var, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bG == 6) {
                g1Var.g((byte) 7);
            } else if (bG == 4) {
                os2.u(g1Var, "object");
                throw null;
            }
            cVar = new c(linkedHashMap);
        }
        this.a--;
        return cVar;
    }

    public a c() {
        g1 g1Var = (g1) this.c;
        byte bF = g1Var.f();
        if (g1Var.w() == 4) {
            g1.q(g1Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (g1Var.c()) {
            arrayList.add(b());
            bF = g1Var.f();
            if (bF != 4) {
                boolean z = bF == 9;
                int i = g1Var.b;
                if (!z) {
                    g1.q(g1Var, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bF == 8) {
            g1Var.g((byte) 9);
        } else if (bF == 4) {
            os2.u(g1Var, "array");
            throw null;
        }
        return new a(arrayList);
    }

    public d d(boolean z) {
        g1 g1Var = (g1) this.c;
        String strL = (this.b || !z) ? g1Var.l() : g1Var.j();
        return (z || !s71.b(strL, "null")) ? new ta1(strL, z, null) : JsonNull.INSTANCE;
    }

    public tb1(MessageDigest messageDigest, int i) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.c = messageDigest;
        this.a = i;
    }
}
