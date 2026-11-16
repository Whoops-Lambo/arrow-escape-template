package com.google.android.gms.internal.ads;

import defpackage.vx4;
import defpackage.wx4;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zziet extends AbstractMap implements Serializable {
    public final boolean a;
    public wx4 b;
    public int c;
    public int d;
    public final wx4 e;
    public vx4 f;
    public vx4 g;

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.b = null;
        this.c = 0;
        this.d++;
        wx4 wx4Var = this.e;
        wx4Var.e = wx4Var;
        wx4Var.d = wx4Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        wx4 wx4VarA = null;
        if (obj != null) {
            try {
                wx4VarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return wx4VarA != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        wx4 wx4VarA;
        if (obj != null) {
            try {
                wx4VarA = a(obj, false);
            } catch (ClassCastException unused) {
                wx4VarA = null;
            }
        } else {
            wx4VarA = null;
        }
        if (wx4VarA != null) {
            return wx4VarA.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            defpackage.d.w("key == null");
            return null;
        }
        if (obj2 == null && !this.a) {
            defpackage.d.w("value == null");
            return null;
        }
        wx4 wx4VarA = a(obj, true);
        Object obj3 = wx4VarA.h;
        wx4VarA.h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        wx4 wx4VarA;
        if (obj != null) {
            try {
                wx4VarA = a(obj, false);
            } catch (ClassCastException unused) {
                wx4VarA = null;
            }
        } else {
            wx4VarA = null;
        }
        if (wx4VarA != null) {
            b(wx4VarA, true);
        }
        if (wx4VarA != null) {
            return wx4VarA.h;
        }
        return null;
    }

    public final wx4 a(Object obj, boolean z) {
        int iCompareTo;
        wx4 wx4Var;
        wx4 wx4Var2 = this.b;
        if (wx4Var2 != null) {
            Comparable comparable = (Comparable) obj;
            while (true) {
                iCompareTo = comparable.compareTo(wx4Var2.f);
                if (iCompareTo == 0) {
                    return wx4Var2;
                }
                wx4 wx4Var3 = iCompareTo < 0 ? wx4Var2.b : wx4Var2.c;
                if (wx4Var3 == null) {
                    break;
                }
                wx4Var2 = wx4Var3;
            }
        } else {
            iCompareTo = 0;
        }
        wx4 wx4Var4 = wx4Var2;
        if (!z) {
            return null;
        }
        wx4 wx4Var5 = this.e;
        if (wx4Var4 != null) {
            wx4 wx4Var6 = new wx4(this.a, wx4Var4, obj, wx4Var5, wx4Var5.e);
            if (iCompareTo < 0) {
                wx4Var4.b = wx4Var6;
            } else {
                wx4Var4.c = wx4Var6;
            }
            d(wx4Var4, true);
            wx4Var = wx4Var6;
        } else {
            if (!(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            wx4Var = new wx4(this.a, null, obj, wx4Var5, wx4Var5.e);
            this.b = wx4Var;
        }
        this.c++;
        this.d++;
        return wx4Var;
    }

    public final void b(wx4 wx4Var, boolean z) {
        wx4 wx4Var2;
        wx4 wx4Var3;
        int i;
        if (z) {
            wx4 wx4Var4 = wx4Var.e;
            wx4Var4.d = wx4Var.d;
            wx4Var.d.e = wx4Var4;
        }
        wx4 wx4Var5 = wx4Var.b;
        wx4 wx4Var6 = wx4Var.c;
        wx4 wx4Var7 = wx4Var.a;
        int i2 = 0;
        if (wx4Var5 == null || wx4Var6 == null) {
            if (wx4Var5 != null) {
                c(wx4Var, wx4Var5);
                wx4Var.b = null;
            } else if (wx4Var6 != null) {
                c(wx4Var, wx4Var6);
                wx4Var.c = null;
            } else {
                c(wx4Var, null);
            }
            d(wx4Var7, false);
            this.c--;
            this.d++;
            return;
        }
        if (wx4Var5.i > wx4Var6.i) {
            do {
                wx4Var3 = wx4Var5;
                wx4Var5 = wx4Var5.c;
            } while (wx4Var5 != null);
        } else {
            do {
                wx4Var2 = wx4Var6;
                wx4Var6 = wx4Var6.b;
            } while (wx4Var6 != null);
            wx4Var3 = wx4Var2;
        }
        b(wx4Var3, false);
        wx4 wx4Var8 = wx4Var.b;
        if (wx4Var8 != null) {
            i = wx4Var8.i;
            wx4Var3.b = wx4Var8;
            wx4Var8.a = wx4Var3;
            wx4Var.b = null;
        } else {
            i = 0;
        }
        wx4 wx4Var9 = wx4Var.c;
        if (wx4Var9 != null) {
            i2 = wx4Var9.i;
            wx4Var3.c = wx4Var9;
            wx4Var9.a = wx4Var3;
            wx4Var.c = null;
        }
        wx4Var3.i = Math.max(i, i2) + 1;
        c(wx4Var, wx4Var3);
    }

    public final void c(wx4 wx4Var, wx4 wx4Var2) {
        wx4 wx4Var3 = wx4Var.a;
        wx4Var.a = null;
        if (wx4Var2 != null) {
            wx4Var2.a = wx4Var3;
        }
        if (wx4Var3 == null) {
            this.b = wx4Var2;
        } else if (wx4Var3.b == wx4Var) {
            wx4Var3.b = wx4Var2;
        } else {
            wx4Var3.c = wx4Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0080 A[SYNTHETIC] */
    public final void d(wx4 wx4Var, boolean z) {
        while (wx4Var != null) {
            wx4 wx4Var2 = wx4Var.b;
            wx4 wx4Var3 = wx4Var.c;
            boolean z2 = false;
            int i = wx4Var2 != null ? wx4Var2.i : 0;
            int i2 = wx4Var3 != null ? wx4Var3.i : 0;
            int i3 = i - i2;
            boolean z3 = true;
            if (i3 == -2) {
                wx4 wx4Var4 = wx4Var3.b;
                wx4 wx4Var5 = wx4Var3.c;
                int i4 = (wx4Var4 != null ? wx4Var4.i : 0) - (wx4Var5 != null ? wx4Var5.i : 0);
                if (i4 != -1) {
                    if (i4 == 0) {
                        if (!z) {
                        }
                        if (z3) {
                            return;
                        }
                    } else {
                        z3 = z;
                    }
                    g(wx4Var3);
                    f(wx4Var);
                    if (z3) {
                        return;
                    }
                } else {
                    z2 = z;
                }
                f(wx4Var);
                z3 = z2;
                if (z3) {
                    return;
                }
            } else if (i3 == 2) {
                wx4 wx4Var6 = wx4Var2.b;
                wx4 wx4Var7 = wx4Var2.c;
                int i5 = (wx4Var6 != null ? wx4Var6.i : 0) - (wx4Var7 != null ? wx4Var7.i : 0);
                if (i5 != 1) {
                    if (i5 == 0) {
                        if (!z) {
                        }
                        if (z3) {
                            return;
                        }
                    } else {
                        z3 = z;
                    }
                    f(wx4Var2);
                    g(wx4Var);
                    if (z3) {
                        return;
                    }
                } else {
                    z2 = z;
                }
                g(wx4Var);
                z3 = z2;
                if (z3) {
                    return;
                }
            } else if (i3 == 0) {
                wx4Var.i = i + 1;
                if (z) {
                    return;
                }
            } else {
                wx4Var.i = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            wx4Var = wx4Var.a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        vx4 vx4Var = this.f;
        if (vx4Var != null) {
            return vx4Var;
        }
        vx4 vx4Var2 = new vx4(this, 0);
        this.f = vx4Var2;
        return vx4Var2;
    }

    public final void f(wx4 wx4Var) {
        wx4 wx4Var2 = wx4Var.b;
        wx4 wx4Var3 = wx4Var.c;
        wx4 wx4Var4 = wx4Var3.b;
        wx4 wx4Var5 = wx4Var3.c;
        wx4Var.c = wx4Var4;
        if (wx4Var4 != null) {
            wx4Var4.a = wx4Var;
        }
        c(wx4Var, wx4Var3);
        wx4Var3.b = wx4Var;
        wx4Var.a = wx4Var3;
        int iMax = Math.max(wx4Var2 != null ? wx4Var2.i : 0, wx4Var4 != null ? wx4Var4.i : 0) + 1;
        wx4Var.i = iMax;
        wx4Var3.i = Math.max(iMax, wx4Var5 != null ? wx4Var5.i : 0) + 1;
    }

    public final void g(wx4 wx4Var) {
        wx4 wx4Var2 = wx4Var.b;
        wx4 wx4Var3 = wx4Var.c;
        wx4 wx4Var4 = wx4Var2.b;
        wx4 wx4Var5 = wx4Var2.c;
        wx4Var.b = wx4Var5;
        if (wx4Var5 != null) {
            wx4Var5.a = wx4Var;
        }
        c(wx4Var, wx4Var2);
        wx4Var2.c = wx4Var;
        wx4Var.a = wx4Var2;
        int iMax = Math.max(wx4Var3 != null ? wx4Var3.i : 0, wx4Var5 != null ? wx4Var5.i : 0) + 1;
        wx4Var.i = iMax;
        wx4Var2.i = Math.max(iMax, wx4Var4 != null ? wx4Var4.i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        vx4 vx4Var = this.g;
        if (vx4Var != null) {
            return vx4Var;
        }
        vx4 vx4Var2 = new vx4(this, 1);
        this.g = vx4Var2;
        return vx4Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }

    public zziet(boolean z) {
        this.c = 0;
        this.d = 0;
        this.a = z;
        this.e = new wx4(z);
    }

    public zziet() {
        this(true);
    }
}
