package com.explorestack.protobuf;

import com.unity3d.services.core.fid.Constants;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class z5 {
    public static final b4 c = new b4(1);
    public final /* synthetic */ int a;
    public Object b;

    public z5(int i) {
        q6 q6Var;
        this.a = i;
        switch (i) {
            case 2:
                this.b = new ArrayDeque();
                break;
            case 5:
                break;
            default:
                try {
                    int i2 = y.a;
                    q6Var = (q6) y.class.getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                } catch (Exception unused) {
                    q6Var = c;
                }
                q6[] q6VarArr = {b4.b, q6Var};
                y5 y5Var = new y5();
                y5Var.a = q6VarArr;
                Charset charset = l5.a;
                this.b = y5Var;
                break;
        }
    }

    public q8 a() {
        q8 q8Var = (q8) this.b;
        List list = q8Var.a;
        if (list == null) {
            q8Var.a = Collections.EMPTY_LIST;
        } else {
            q8Var.a = Collections.unmodifiableList(list);
        }
        q8 q8Var2 = (q8) this.b;
        List list2 = q8Var2.b;
        if (list2 == null) {
            q8Var2.b = Collections.EMPTY_LIST;
        } else {
            q8Var2.b = Collections.unmodifiableList(list2);
        }
        q8 q8Var3 = (q8) this.b;
        List list3 = q8Var3.c;
        if (list3 == null) {
            q8Var3.c = Collections.EMPTY_LIST;
        } else {
            q8Var3.c = Collections.unmodifiableList(list3);
        }
        q8 q8Var4 = (q8) this.b;
        List list4 = q8Var4.d;
        if (list4 == null) {
            q8Var4.d = Collections.EMPTY_LIST;
        } else {
            q8Var4.d = Collections.unmodifiableList(list4);
        }
        q8 q8Var5 = (q8) this.b;
        List list5 = q8Var5.e;
        if (list5 == null) {
            q8Var5.e = Collections.EMPTY_LIST;
        } else {
            q8Var5.e = Collections.unmodifiableList(list5);
        }
        q8 q8Var6 = (q8) this.b;
        this.b = null;
        return q8Var6;
    }

    public void c(q8 q8Var) {
        if (!q8Var.a.isEmpty()) {
            q8 q8Var2 = (q8) this.b;
            if (q8Var2.a == null) {
                q8Var2.a = new ArrayList();
            }
            ((q8) this.b).a.addAll(q8Var.a);
        }
        if (!q8Var.b.isEmpty()) {
            q8 q8Var3 = (q8) this.b;
            if (q8Var3.b == null) {
                q8Var3.b = new ArrayList();
            }
            ((q8) this.b).b.addAll(q8Var.b);
        }
        if (!q8Var.c.isEmpty()) {
            q8 q8Var4 = (q8) this.b;
            if (q8Var4.c == null) {
                q8Var4.c = new ArrayList();
            }
            ((q8) this.b).c.addAll(q8Var.c);
        }
        if (!q8Var.d.isEmpty()) {
            q8 q8Var5 = (q8) this.b;
            if (q8Var5.d == null) {
                q8Var5.d = new ArrayList();
            }
            ((q8) this.b).d.addAll(q8Var.d);
        }
        if (q8Var.e.isEmpty()) {
            return;
        }
        q8 q8Var6 = (q8) this.b;
        if (q8Var6.e == null) {
            q8Var6.e = new ArrayList();
        }
        ((q8) this.b).e.addAll(q8Var.e);
    }

    public int d() {
        switch (this.a) {
            case 3:
                return ((ByteString) this.b).size();
            default:
                return ((byte[]) this.b).length;
        }
    }

    public void b(ByteString byteString) {
        if (byteString.isBalanced()) {
            int iBinarySearch = Arrays.binarySearch(s7.f, byteString.size());
            if (iBinarySearch < 0) {
                iBinarySearch = (-(iBinarySearch + 1)) - 1;
            }
            int iC = s7.c(iBinarySearch + 1);
            ArrayDeque arrayDeque = (ArrayDeque) this.b;
            if (!arrayDeque.isEmpty() && ((ByteString) arrayDeque.peek()).size() < iC) {
                int iC2 = s7.c(iBinarySearch);
                ByteString s7Var = (ByteString) arrayDeque.pop();
                while (!arrayDeque.isEmpty() && ((ByteString) arrayDeque.peek()).size() < iC2) {
                    s7Var = new s7((ByteString) arrayDeque.pop(), s7Var);
                }
                s7 s7Var2 = new s7(s7Var, byteString);
                while (!arrayDeque.isEmpty()) {
                    int iBinarySearch2 = Arrays.binarySearch(s7.f, s7Var2.a);
                    if (iBinarySearch2 < 0) {
                        iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
                    }
                    if (((ByteString) arrayDeque.peek()).size() >= s7.c(iBinarySearch2 + 1)) {
                        break;
                    } else {
                        s7Var2 = new s7((ByteString) arrayDeque.pop(), s7Var2);
                    }
                }
                arrayDeque.push(s7Var2);
                return;
            }
            arrayDeque.push(byteString);
            return;
        }
        if (byteString instanceof s7) {
            s7 s7Var3 = (s7) byteString;
            b(s7Var3.b);
            b(s7Var3.c);
            return;
        }
        defpackage.d.q(byteString.getClass(), "Has a new type of ByteString been created? Found ");
    }

    public /* synthetic */ z5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
