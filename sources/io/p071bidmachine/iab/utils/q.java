package io.p071bidmachine.iab.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class q implements Serializable {
    public Integer a;
    public Integer b;
    public Boolean c;
    public Boolean d;
    public Integer e;
    public Integer f;
    public String g;
    public Float h;
    public Float i;
    public Integer j;
    public Integer k;
    public Integer l;
    public Integer m;
    public Integer n;
    public Integer o;
    public Integer p;
    public Integer q;
    public String r;
    public Float s;
    public Float t;
    public Float u;
    public Integer v;
    public Float w;

    public final void a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Integer num = 0;
        Integer num2 = this.n;
        marginLayoutParams.leftMargin = (num2 != null ? Integer.valueOf(y.c(context, num2.intValue())) : num).intValue();
        Integer num3 = this.o;
        marginLayoutParams.topMargin = (num3 != null ? Integer.valueOf(y.c(context, num3.intValue())) : num).intValue();
        Integer num4 = this.p;
        marginLayoutParams.rightMargin = (num4 != null ? Integer.valueOf(y.c(context, num4.intValue())) : num).intValue();
        Integer num5 = this.q;
        marginLayoutParams.bottomMargin = (num5 != null ? Integer.valueOf(y.c(context, num5.intValue())) : 0).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    public final void c(RelativeLayout.LayoutParams layoutParams) {
        Integer num = this.e;
        if (num == null) {
            num = 3;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            layoutParams.addRule(14);
        } else if (iIntValue == 3) {
            layoutParams.addRule(9);
        } else if (iIntValue == 5) {
            layoutParams.addRule(11);
        } else if (iIntValue == 17) {
            layoutParams.addRule(14);
        }
        Integer num2 = this.f;
        if (num2 == null) {
            num2 = 48;
        }
        int iIntValue2 = num2.intValue();
        if (iIntValue2 == 16 || iIntValue2 == 17) {
            layoutParams.addRule(15);
        } else if (iIntValue2 == 48) {
            layoutParams.addRule(10);
        } else {
            if (iIntValue2 != 80) {
                return;
            }
            layoutParams.addRule(12);
        }
    }

    public final q d(q qVar) {
        q qVar2 = new q();
        qVar2.o(this);
        qVar2.o(qVar);
        return qVar2;
    }

    public final Integer f() {
        Integer num = this.b;
        return num != null ? num : Integer.valueOf(a.b);
    }

    public final Integer g(Context context) {
        Integer num = this.m;
        if (num != null) {
            return Integer.valueOf(y.c(context, num.intValue()));
        }
        return 0;
    }

    public final Integer h(Context context) {
        Integer num = this.j;
        if (num != null) {
            return Integer.valueOf(y.c(context, num.intValue()));
        }
        return 0;
    }

    public final Integer i(Context context) {
        Integer num = this.k;
        if (num != null) {
            return Integer.valueOf(y.c(context, num.intValue()));
        }
        return 0;
    }

    public final Integer j(Context context) {
        Integer num = this.l;
        if (num != null) {
            return Integer.valueOf(y.c(context, num.intValue()));
        }
        return 0;
    }

    public final Float k(Context context) {
        Float f = this.s;
        return f != null ? Float.valueOf(y.c(context, f.floatValue())) : Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final Boolean n() {
        Boolean bool = this.d;
        return bool != null ? bool : Boolean.TRUE;
    }

    public final void o(q qVar) {
        if (qVar == null) {
            return;
        }
        Integer num = qVar.a;
        if (num != null) {
            this.a = num;
        }
        Integer num2 = qVar.b;
        if (num2 != null) {
            this.b = num2;
        }
        Boolean bool = qVar.c;
        if (bool != null) {
            this.c = bool;
        }
        Boolean bool2 = qVar.d;
        if (bool2 != null) {
            this.d = bool2;
        }
        Integer num3 = qVar.e;
        if (num3 != null) {
            this.e = num3;
        }
        Integer num4 = qVar.f;
        if (num4 != null) {
            this.f = num4;
        }
        String str = qVar.g;
        if (str != null) {
            this.g = str;
        }
        Float f = qVar.h;
        if (f != null) {
            this.h = f;
        }
        Float f2 = qVar.i;
        if (f2 != null) {
            this.i = f2;
        }
        Integer num5 = qVar.j;
        if (num5 != null) {
            this.j = num5;
        }
        Integer num6 = qVar.k;
        if (num6 != null) {
            this.k = num6;
        }
        Integer num7 = qVar.l;
        if (num7 != null) {
            this.l = num7;
        }
        Integer num8 = qVar.m;
        if (num8 != null) {
            this.m = num8;
        }
        Integer num9 = qVar.n;
        if (num9 != null) {
            this.n = num9;
        }
        Integer num10 = qVar.p;
        if (num10 != null) {
            this.p = num10;
        }
        Integer num11 = qVar.o;
        if (num11 != null) {
            this.o = num11;
        }
        Integer num12 = qVar.q;
        if (num12 != null) {
            this.q = num12;
        }
        String str2 = qVar.r;
        if (str2 != null) {
            this.r = str2;
        }
        Float f3 = qVar.s;
        if (f3 != null) {
            this.s = f3;
        }
        Float f4 = qVar.t;
        if (f4 != null) {
            this.t = f4;
        }
        Float f5 = qVar.u;
        if (f5 != null) {
            this.u = f5;
        }
        Integer num13 = qVar.v;
        if (num13 != null) {
            this.v = num13;
        }
        Float f6 = qVar.w;
        if (f6 != null) {
            this.w = f6;
        }
    }

    public final void q(Number number) {
        this.u = number != null ? Float.valueOf(number.floatValue()) : null;
    }

    public final void r(Integer num, Integer num2, Integer num3, Integer num4) {
        this.n = num;
        this.o = num2;
        this.p = num3;
        this.q = num4;
    }

    public final void x(Integer num, Integer num2, Integer num3, Integer num4) {
        this.j = num;
        this.l = num2;
        this.k = num3;
        this.m = num4;
    }

    public final void z(Number number) {
        this.t = number != null ? Float.valueOf(number.floatValue()) : null;
    }

    public final void b(Context context, View view) {
        view.setPadding(h(context).intValue(), j(context).intValue(), i(context).intValue(), g(context).intValue());
    }

    public final void t(String str) {
        if (TextUtils.isEmpty(str)) {
            r(null, null, null, null);
            return;
        }
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length == 1) {
            int iIntValue = y.b(strArrSplit[0]).intValue();
            r(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue));
            return;
        }
        if (strArrSplit.length == 2) {
            int iIntValue2 = y.b(strArrSplit[0]).intValue();
            int iIntValue3 = y.b(strArrSplit[1]).intValue();
            r(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2));
        } else {
            if (strArrSplit.length == 3) {
                int iIntValue4 = y.b(strArrSplit[0]).intValue();
                int iIntValue5 = y.b(strArrSplit[1]).intValue();
                r(Integer.valueOf(iIntValue5), Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5), Integer.valueOf(y.b(strArrSplit[2]).intValue()));
                return;
            }
            if (strArrSplit.length == 4) {
                r(Integer.valueOf(y.b(strArrSplit[3]).intValue()), Integer.valueOf(y.b(strArrSplit[0]).intValue()), Integer.valueOf(y.b(strArrSplit[1]).intValue()), Integer.valueOf(y.b(strArrSplit[2]).intValue()));
            }
        }
    }

    public final void y(String str) {
        if (TextUtils.isEmpty(str)) {
            x(null, null, null, null);
            return;
        }
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length == 1) {
            int iIntValue = y.b(strArrSplit[0]).intValue();
            x(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue));
            return;
        }
        if (strArrSplit.length == 2) {
            int iIntValue2 = y.b(strArrSplit[0]).intValue();
            int iIntValue3 = y.b(strArrSplit[1]).intValue();
            x(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2));
        } else {
            if (strArrSplit.length == 3) {
                int iIntValue4 = y.b(strArrSplit[0]).intValue();
                int iIntValue5 = y.b(strArrSplit[1]).intValue();
                x(Integer.valueOf(iIntValue5), Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5), Integer.valueOf(y.b(strArrSplit[2]).intValue()));
                return;
            }
            if (strArrSplit.length == 4) {
                x(Integer.valueOf(y.b(strArrSplit[3]).intValue()), Integer.valueOf(y.b(strArrSplit[0]).intValue()), Integer.valueOf(y.b(strArrSplit[1]).intValue()), Integer.valueOf(y.b(strArrSplit[2]).intValue()));
            }
        }
    }
}
