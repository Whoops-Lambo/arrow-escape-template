package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class ne1 extends AbstractMap implements Serializable {
    public static final zm h = new zm(7);
    public me1 b;
    public ke1 f;
    public ke1 g;
    public int c = 0;
    public int d = 0;
    public final me1 e = new me1();
    public final Comparator a = h;

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.b = null;
        this.c = 0;
        this.d++;
        me1 me1Var = this.e;
        me1Var.e = me1Var;
        me1Var.d = me1Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        me1 me1VarA = null;
        if (obj != null) {
            try {
                me1VarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return me1VarA != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        me1 me1VarA;
        if (obj != null) {
            try {
                me1VarA = a(obj, false);
            } catch (ClassCastException unused) {
                me1VarA = null;
            }
        } else {
            me1VarA = null;
        }
        if (me1VarA != null) {
            return me1VarA.g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        me1 me1VarA;
        if (obj != null) {
            try {
                me1VarA = a(obj, false);
            } catch (ClassCastException unused) {
                me1VarA = null;
            }
        } else {
            me1VarA = null;
        }
        if (me1VarA != null) {
            c(me1VarA, true);
        }
        if (me1VarA != null) {
            return me1VarA.g;
        }
        return null;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final me1 a(Object obj, boolean z) {
        int iCompareTo;
        me1 me1Var;
        me1 me1Var2 = this.b;
        zm zmVar = h;
        Comparator comparator = this.a;
        if (me1Var2 != null) {
            Comparable comparable = comparator == zmVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = me1Var2.f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return me1Var2;
                }
                me1 me1Var3 = iCompareTo < 0 ? me1Var2.b : me1Var2.c;
                if (me1Var3 == null) {
                    break;
                }
                me1Var2 = me1Var3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        me1 me1Var4 = this.e;
        if (me1Var2 != null) {
            me1Var = new me1(me1Var2, obj, me1Var4, me1Var4.e);
            if (iCompareTo < 0) {
                me1Var2.b = me1Var;
            } else {
                me1Var2.c = me1Var;
            }
            b(me1Var2, true);
        } else {
            if (comparator == zmVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            me1Var = new me1(me1Var2, obj, me1Var4, me1Var4.e);
            this.b = me1Var;
        }
        this.c++;
        this.d++;
        return me1Var;
    }

    public final void b(me1 me1Var, boolean z) {
        while (me1Var != null) {
            me1 me1Var2 = me1Var.b;
            me1 me1Var3 = me1Var.c;
            int i = me1Var2 != null ? me1Var2.h : 0;
            int i2 = me1Var3 != null ? me1Var3.h : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                me1 me1Var4 = me1Var3.b;
                me1 me1Var5 = me1Var3.c;
                int i4 = (me1Var4 != null ? me1Var4.h : 0) - (me1Var5 != null ? me1Var5.h : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    f(me1Var);
                } else {
                    g(me1Var3);
                    f(me1Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                me1 me1Var6 = me1Var2.b;
                me1 me1Var7 = me1Var2.c;
                int i5 = (me1Var6 != null ? me1Var6.h : 0) - (me1Var7 != null ? me1Var7.h : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    g(me1Var);
                } else {
                    f(me1Var2);
                    g(me1Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                me1Var.h = i + 1;
                if (z) {
                    return;
                }
            } else {
                me1Var.h = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            me1Var = me1Var.a;
        }
    }

    public final void c(me1 me1Var, boolean z) {
        me1 me1Var2;
        me1 me1Var3;
        int i;
        if (z) {
            me1 me1Var4 = me1Var.e;
            me1Var4.d = me1Var.d;
            me1Var.d.e = me1Var4;
        }
        me1 me1Var5 = me1Var.b;
        me1 me1Var6 = me1Var.c;
        me1 me1Var7 = me1Var.a;
        int i2 = 0;
        if (me1Var5 == null || me1Var6 == null) {
            if (me1Var5 != null) {
                d(me1Var, me1Var5);
                me1Var.b = null;
            } else if (me1Var6 != null) {
                d(me1Var, me1Var6);
                me1Var.c = null;
            } else {
                d(me1Var, null);
            }
            b(me1Var7, false);
            this.c--;
            this.d++;
            return;
        }
        if (me1Var5.h > me1Var6.h) {
            me1 me1Var8 = me1Var5.c;
            while (true) {
                me1 me1Var9 = me1Var8;
                me1Var3 = me1Var5;
                me1Var5 = me1Var9;
                if (me1Var5 == null) {
                    break;
                } else {
                    me1Var8 = me1Var5.c;
                }
            }
        } else {
            me1 me1Var10 = me1Var6.b;
            while (true) {
                me1Var2 = me1Var6;
                me1Var6 = me1Var10;
                if (me1Var6 == null) {
                    break;
                } else {
                    me1Var10 = me1Var6.b;
                }
            }
            me1Var3 = me1Var2;
        }
        c(me1Var3, false);
        me1 me1Var11 = me1Var.b;
        if (me1Var11 != null) {
            i = me1Var11.h;
            me1Var3.b = me1Var11;
            me1Var11.a = me1Var3;
            me1Var.b = null;
        } else {
            i = 0;
        }
        me1 me1Var12 = me1Var.c;
        if (me1Var12 != null) {
            i2 = me1Var12.h;
            me1Var3.c = me1Var12;
            me1Var12.a = me1Var3;
            me1Var.c = null;
        }
        me1Var3.h = Math.max(i, i2) + 1;
        d(me1Var, me1Var3);
    }

    public final void d(me1 me1Var, me1 me1Var2) {
        me1 me1Var3 = me1Var.a;
        me1Var.a = null;
        if (me1Var2 != null) {
            me1Var2.a = me1Var3;
        }
        if (me1Var3 == null) {
            this.b = me1Var2;
        } else if (me1Var3.b == me1Var) {
            me1Var3.b = me1Var2;
        } else {
            me1Var3.c = me1Var2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        ke1 ke1Var = this.f;
        if (ke1Var != null) {
            return ke1Var;
        }
        ke1 ke1Var2 = new ke1(this, 0);
        this.f = ke1Var2;
        return ke1Var2;
    }

    public final void f(me1 me1Var) {
        me1 me1Var2 = me1Var.b;
        me1 me1Var3 = me1Var.c;
        me1 me1Var4 = me1Var3.b;
        me1 me1Var5 = me1Var3.c;
        me1Var.c = me1Var4;
        if (me1Var4 != null) {
            me1Var4.a = me1Var;
        }
        d(me1Var, me1Var3);
        me1Var3.b = me1Var;
        me1Var.a = me1Var3;
        int iMax = Math.max(me1Var2 != null ? me1Var2.h : 0, me1Var4 != null ? me1Var4.h : 0) + 1;
        me1Var.h = iMax;
        me1Var3.h = Math.max(iMax, me1Var5 != null ? me1Var5.h : 0) + 1;
    }

    public final void g(me1 me1Var) {
        me1 me1Var2 = me1Var.b;
        me1 me1Var3 = me1Var.c;
        me1 me1Var4 = me1Var2.b;
        me1 me1Var5 = me1Var2.c;
        me1Var.b = me1Var5;
        if (me1Var5 != null) {
            me1Var5.a = me1Var;
        }
        d(me1Var, me1Var2);
        me1Var2.c = me1Var;
        me1Var.a = me1Var2;
        int iMax = Math.max(me1Var3 != null ? me1Var3.h : 0, me1Var5 != null ? me1Var5.h : 0) + 1;
        me1Var.h = iMax;
        me1Var2.h = Math.max(iMax, me1Var4 != null ? me1Var4.h : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        ke1 ke1Var = this.g;
        if (ke1Var != null) {
            return ke1Var;
        }
        ke1 ke1Var2 = new ke1(this, 1);
        this.g = ke1Var2;
        return ke1Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            d.w("key == null");
            return null;
        }
        me1 me1VarA = a(obj, true);
        Object obj3 = me1VarA.g;
        me1VarA.g = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }
}
