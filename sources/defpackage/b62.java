package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.u1;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class b62 {
    public final ArrayDeque a;

    public void b() {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + d());
    }

    public long d() {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    public b62(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayDeque(16);
                break;
            default:
                this.a = new ArrayDeque();
                break;
        }
    }

    public void a(ByteString byteString) {
        if (byteString.isBalanced()) {
            int iBinarySearch = Arrays.binarySearch(u1.f, byteString.size());
            if (iBinarySearch < 0) {
                iBinarySearch = (-(iBinarySearch + 1)) - 1;
            }
            int iC = u1.c(iBinarySearch + 1);
            ArrayDeque arrayDeque = this.a;
            if (!arrayDeque.isEmpty() && ((ByteString) arrayDeque.peek()).size() < iC) {
                int iC2 = u1.c(iBinarySearch);
                ByteString u1Var = (ByteString) arrayDeque.pop();
                while (!arrayDeque.isEmpty() && ((ByteString) arrayDeque.peek()).size() < iC2) {
                    u1Var = new u1((ByteString) arrayDeque.pop(), u1Var);
                }
                u1 u1Var2 = new u1(u1Var, byteString);
                while (!arrayDeque.isEmpty()) {
                    int iBinarySearch2 = Arrays.binarySearch(u1.f, u1Var2.a);
                    if (iBinarySearch2 < 0) {
                        iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
                    }
                    if (((ByteString) arrayDeque.peek()).size() >= u1.c(iBinarySearch2 + 1)) {
                        break;
                    } else {
                        u1Var2 = new u1((ByteString) arrayDeque.pop(), u1Var2);
                    }
                }
                arrayDeque.push(u1Var2);
                return;
            }
            arrayDeque.push(byteString);
            return;
        }
        if (byteString instanceof u1) {
            u1 u1Var3 = (u1) byteString;
            a(u1Var3.b);
            a(u1Var3.c);
            return;
        }
        d.q(byteString.getClass(), "Has a new type of ByteString been created? Found ");
    }

    public void c(long j) {
        long jD = d();
        if (jD != j) {
            if (jD != -1) {
                if (jD == -2) {
                    jD = -2;
                } else {
                    return;
                }
            }
            StringBuilder sbO = h50.o(j, "expected non-string scope or scope ", " but found ");
            sbO.append(jD);
            throw new IOException(sbO.toString());
        }
    }
}
