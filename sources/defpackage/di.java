package defpackage;

import com.google.android.gms.internal.ads.zzhmr;
import com.google.android.gms.internal.ads.zzhnn;
import com.google.android.gms.internal.ads.zzicj;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import io.p071bidmachine.media3.extractor.text.j;
import io.p071bidmachine.rendering.internal.adform.countdown.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.AEADBadTagException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class di {
    public final Object a;
    public Object b;

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract ov4 k(int i, byte[] bArr);

    public void a(Object obj) {
        ArrayList arrayList = (ArrayList) this.a;
        if (arrayList.isEmpty()) {
            this.b = obj;
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            n23 n23Var = (n23) obj2;
            if (n23Var != null) {
                n23Var.a(obj);
            }
        }
    }

    public boolean b(String str, boolean z) {
        a aVar = (a) this.b;
        Object objD = d(str, Boolean.valueOf(z));
        j jVar = (j) aVar.b;
        Boolean boolValueOf = null;
        if (objD != null) {
            Boolean bool = objD instanceof Boolean ? (Boolean) objD : null;
            if (bool != null) {
                boolValueOf = bool;
            } else {
                String strV = jVar.v(objD);
                if (strV != null) {
                    try {
                        boolValueOf = Boolean.valueOf(strV);
                    } catch (Exception e) {
                        io.p071bidmachine.core.a.i(e);
                    }
                }
            }
        }
        return boolValueOf != null ? boolValueOf.booleanValue() : z;
    }

    public int c(String str) {
        Integer numA = ((a) this.b).a(d(str, 0));
        if (numA != null) {
            return numA.intValue();
        }
        return 0;
    }

    public Object d(Object obj, Object obj2) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a;
        return concurrentHashMap.containsKey(obj) ? concurrentHashMap.get(obj) : obj2;
    }

    public String e(String str) {
        return ((a) this.b).g(d(str, null));
    }

    public void i(n23 n23Var) {
        ((ArrayList) this.a).add(n23Var);
        Object obj = this.b;
        if (obj != null) {
            n23Var.a(obj);
            this.b = null;
        }
    }

    public void j() {
        ((ArrayList) this.a).clear();
        this.b = null;
    }

    public di(int i) {
        switch (i) {
            case 1:
                this.a = new hj1(this);
                break;
            case 2:
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                a aVar = new a(16);
                this.a = concurrentHashMap;
                this.b = aVar;
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    public byte[] l(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i;
        int i2;
        if (byteBuffer.remaining() >= 16) {
            int iPosition = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(iPosition);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr4 = new byte[32];
                ((ov4) this.b).f(0, bArr).get(bArr4);
                int length = bArr2.length;
                int i3 = length & 15;
                if (i3 == 0) {
                    i = length;
                } else {
                    i = (length + 16) - i3;
                }
                int iRemaining = byteBuffer.remaining();
                int i4 = iRemaining % 16;
                if (i4 == 0) {
                    i2 = iRemaining;
                } else {
                    i2 = (iRemaining + 16) - i4;
                }
                int i5 = i2 + i;
                ByteBuffer byteBufferOrder = ByteBuffer.allocate(i5 + 16).order(ByteOrder.LITTLE_ENDIAN);
                byteBufferOrder.put(bArr2);
                byteBufferOrder.position(i);
                byteBufferOrder.put(byteBuffer);
                byteBufferOrder.position(i5);
                byteBufferOrder.putLong(length);
                byteBufferOrder.putLong(iRemaining);
                if (MessageDigest.isEqual(zzhmr.a(bArr4, byteBufferOrder.array()), bArr3)) {
                    byteBuffer.position(iPosition);
                    ov4 ov4Var = (ov4) this.a;
                    ov4Var.getClass();
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
                    if (bArr.length == ov4Var.e()) {
                        int iRemaining2 = byteBuffer.remaining();
                        int i6 = iRemaining2 / 64;
                        for (int i7 = 0; i7 < i6 + 1; i7++) {
                            ByteBuffer byteBufferF = ov4Var.f(ov4Var.b + i7, bArr);
                            if (i7 == i6) {
                                zzicj.c(byteBufferAllocate, byteBuffer, byteBufferF, iRemaining2 % 64);
                            } else {
                                zzicj.c(byteBufferAllocate, byteBuffer, byteBufferF, 64);
                            }
                        }
                        return byteBufferAllocate.array();
                    }
                    int iE = ov4Var.e();
                    throw new GeneralSecurityException(pv1.l(iE, "The nonce length (in bytes) must be ", new StringBuilder(String.valueOf(iE).length() + 36)));
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        }
        e.d("ciphertext too short");
        return null;
    }

    public di(byte[] bArr) throws GeneralSecurityException {
        if (zzhnn.a(1)) {
            this.a = k(1, bArr);
            this.b = k(0, bArr);
        } else {
            e.d("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
    }
}
