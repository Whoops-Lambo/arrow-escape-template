package io.p071bidmachine.iab.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import io.p071bidmachine.iab.vast.view.a;
import io.p071bidmachine.iab.vast.view.b;
import io.p071bidmachine.iab.vast.view.d;
import io.p071bidmachine.iab.vast.view.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class o extends r {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(View.OnClickListener onClickListener, int i) {
        super(onClickListener);
        this.g = i;
    }

    @Override // io.p071bidmachine.iab.utils.r
    public void b(View view, q qVar) {
        switch (this.g) {
            case 0:
                a aVar = (a) view;
                if ("skip".equals(qVar.g) || "skipfill".equals(qVar.g)) {
                    aVar.setImage(a.a("iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAYAAADnRuK4AAACoklEQVR4Ae3dAUScYRzH8eEQDiEMQxiGIQxhiGEIIQxhGEIIIQzDMAwhDMMQhiEMMIQhhABhCCGEEMLh9gMwi65nPau/z4cvAH784bx37z0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAALiOx+llWkqzxXYtpMU0k/4x5tNBGv/RXpq/57v2/7JrNz1NQauVNErjKxql92lQcNdGasDTdJnG1+ggPS64ay89StzAlzSeoIv0puCu87ScJsRpGt+g3TRTcNdOGqZrYtzQSXpZcNdxep5aOKAJ2kpTBXY1fHBwQK0dprkCuxo+ODig1i7TesFdF2k1tXBAE/QjPSqwq+GDgwNq7SwtFdx1mhZTCwc0QZ/TsOCu7TSVHFCHfqX5gruO0pwD6tMovU2Dgrs20sAB9Wk/zdbZ5Xna+D90kVYK7jpPrxxQv76l6YK7dtK0A+rTSVq4v7s8TxvfkT6mQbFdo/QhDRxQnw7Tk4K7DtITB9Sny7RWcNdFWnNA/fqeHhbdNeOA+nSWFu1yQK19SsOCu7bT0AF1fO5klwNqaZReV93lgPq1XHhXBw7oLE1V3eWA+rRYeFcHDuhd2V13nwNyQA5opfAuB9Thedmw/q7b4oA26u+6LQ5oq/6u2+CAztOKXTfhgH6mWbsm5YBGaTMN7JqUAzpKz+xyQO3f/7HLAbV/U88uB9T+HWi7HFDjrxXsckBNvwOzywG1/GLTLgd0nBbsugkH9DVN21XLnX5vjl0OaC/N2lXUXXzeY5cDOkpzdjmg9t9721Vb1Te4d3qORYd33thVWeF/sem0i7OW9/7ZxW7L8x67mE+jlncf28Vm69vX7WI5nV7xV03LdnEdg/Qirab1tJAGdgEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdPQbak6roi3sq5YAAAAASUVORK5CYII="));
                } else {
                    aVar.setImage(a.a("iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAYAAADnRuK4AAACY0lEQVR4Ae3aAWRbURTH4YNiKIqggKEYCiiKYQQABQAMARRBAVAADEEBUAAEAADBAMMwBADFADAURXYQoZdoOLie+338PQK4fnmJ5wUAAAAAAAAAAAAAAAAAAAAAAHACrnJ3uWVunpvFuM5zX3Pf99fz4KiL3HNu1+w195A7i3Gc5R5zb81ZvO0/b86CWe6ljafZZpBv4GXu9wdn8UtE761zuxP2sxrRBOLZnngWjznSbXs4g0Z0Sjztz9lFEPe5XT2iIeJp9y2IVW5Xj2iMeJotguYOVIlogHiazYO4ye3qEQ0VT/MfiPUAEZXjafYjDpjl/k41og7x/Ml9inf4MsWIOsSzzV0G40QkHhGJR0Ti6U9E4hGRePoTkXhEJJ7+RCQeEYmnPxGJR0TiqROReOpEJJ46EYmnTkTiqROReMpEJJ4CEYmnQETiKRGReEpEJJ4kIvH0JyLxiEg8/YlIPCIST38iEo+IxEP9ZbA+L6UhHhGJR0T9iUdE4hFRf+IRkXhE1It4RNQQz7bysFFE4rksPLEWkXj2RFQgHhGViUdEZeIRUZl4RFQmHhGViUdEZeIRkXjqRCQeEXUnHhGJR0T9iUdE4hFRf+IRkXhEJJ5uRCQeEYlHROM47x/PpCLa5M7igKf+8Uwuoodc4rp/PJOM6DU3i2DRP57JRjSPYNU/nslGtIxgOXA81YjuIpgPHk8loqtcYjNqPIWInuOAz7l/o8VTiOgldxENER2/Ez0N9vR1llsfOYt1bhZHMc8tc6vcIncd47rJ3edW++ttAAAAAAAAAAAAAAAAAAAAAAAAfOA/5Zwc/aYfb7AAAAAASUVORK5CYII="));
                }
                break;
            case 2:
                ((b) view).setText(!TextUtils.isEmpty(qVar.r) ? qVar.r : "Learn more");
                break;
            case 5:
                ((a) view).setImage(a.a("iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAMAAADQmBKKAAAAw1BMVEUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABAcKsgAAAAQXRSTlMAJJeDLG/7//NAr9/Dv6tHGO8cYxRbDFOjS7u3y/d7BNef67PjIHeTz9swj0M401co52vHi3NPp5sQNH9nXzwIhxbEf6oAAAOpSURBVHgB7M5FAcAwAMDAcUYd+9e6Zy2kcAquKUBVVVXVdv3QiIwTzIvoA8Aq+zDLPmD7YPtg+2D7YPtg+2D7YPtg+2D7YPtg+2D7YPtg+2D7sG17OLrxvCSf6N7HR/KJwvupPsD0t2uX28rjABSGN9YNhCO4lnKQ44K73f9Njc+kpQyWtHR9i+c38tbbNMl8AV4r8izxUhneqvBc1RC8VOPZzLoVjF1IaiTgGeuel3jKBa2omQ1aEVuFoBWlfC9qdxL555fWazMoRQL/CNXfAlEkIL1/tOn2+uhrkYDDZ4kuDV+LBHZ8fV+3SGCX9Wy6inzcjwTcOlXueIFvRQL7/DTplPCtSGCvbo8OouBXkcBpRS/wqUjgxKKED0UHg9AVPm00WXQ4CI8NnzaaLDochE6cdglfigQO6NNuAD+KBA65o13Xj6LDQR2TNkP4UFTBQSPaNC3vi4wxDrIGtCnCW+Pq5BNHdA1KVQRAkpKRwfWNaVPH9VlNSgIB8EGbT1xflDbPCIAapSkCoE8phQAIUWoiCAxKMwTAG6U5AqBK6QcBEKYUQQCMKE0QsMtZDQHwHrSrWUc1KDptiMpiBl3mlO4unFtGspeAJmVKSZxtyX+ku9BjRekJ55ql3atX0ULpPLSk1NF/YhwpfXsFLe6VfnLq3uCqUpQelDaZgBZtSmu1W+AONMgo/mKa0hIaZGlTUHvUnOjep78V37D2oM6KK47IvFPvHWdC+UExTSmpd4uZG9XxCkahKKQ+HhOjznPjC21iyg92NEJQkjNpE8JFkhpXUYQaRtDe9a2id4M2Dzqe7FixcDHnmOernlMHt8pPZOp3M3fUsqZDJm16G1zsgXbNDi6Sa1DbiOcr7WoWLrBJaXxhNqZDGBeY0KEMJVU6TCy10Vf1O5lcmw6pGc5ilejQzEHR2qBDI4MzzFJ0WkHZiE69d5ws1KBTFRok6RRfWjhNP+3JdJSZ4I7vBE7QTXFHswst5gZ33YdwxMY9OcZcQ5MlXcztDAc8RtJ0+YE2K4Mu5v/PB45OTbrVodFDnDytqVAOC+6zgFbzHvcyU6Vtv/iVwaaTyI+Gk4HJvYw8NAs1qCC9hnaPA17srQsPFFq8UOoR3sj2eIF0H56ZDQ2eq5WBl7pVnqVXhNfKbzxZ+mMG723qTZ5ExGbwh/U5Pd5U+7Hgo824FD9Us/2Cf2RTk3v0SvlHXEshWl5uJ4M2aYha9SkSyyeiCAJrhl/Tzc3Nzc3Nzc3N7+6ZjDHKAbJeAAAAAElFTkSuQmCC"));
                break;
        }
    }

    @Override // io.p071bidmachine.iab.utils.r
    public final View d(Context context, q qVar) {
        switch (this.g) {
            case 0:
                return new a(context);
            case 1:
                return "text".equals(qVar.g) ? new e(context) : new a(context);
            case 2:
                return new b(context);
            case 3:
                return new d(context);
            case 4:
                if ("text".equals(qVar.g) || "text-reverse".equals(qVar.g)) {
                    return new e(context);
                }
                return ("circular".equals(qVar.g) || "circular-reverse".equals(qVar.g)) ? new a(context) : new d(context);
            default:
                return new a(context);
        }
    }

    @Override // io.p071bidmachine.iab.utils.r
    public final q e(Context context, q qVar) {
        switch (this.g) {
            case 0:
                return a.b(qVar);
            case 1:
                return (qVar == null || !"text".equals(qVar.g)) ? a.f : a.g;
            case 2:
                return a.h;
            case 3:
                return a.n;
            case 4:
                if (qVar != null) {
                    if ("text".equals(qVar.g) || "text-reverse".equals(qVar.g)) {
                        return a.k;
                    }
                    if ("circular".equals(qVar.g) || "circular-reverse".equals(qVar.g)) {
                        return a.m;
                    }
                }
                return a.l;
            default:
                if (qVar == null || !"repeatfill".equals(qVar.g)) {
                    return a.d;
                }
                q qVar2 = new q();
                qVar2.c = Boolean.TRUE;
                return a.d.d(qVar2);
        }
    }

    public void i(float f, int i, int i2) {
        q qVar = this.c;
        if (qVar == null) {
            return;
        }
        String str = qVar.g;
        boolean z = str != null && str.endsWith("reverse");
        View view = this.b;
        if (view instanceof e) {
            e eVar = (e) view;
            if (i2 == 0) {
                eVar.setText("");
                return;
            }
            if (z) {
                i = i2 - i;
            }
            eVar.setRemaining(Math.max(1, i));
            return;
        }
        if (view instanceof a) {
            a aVar = (a) view;
            if (z) {
                aVar.c(f, i2 != 0 ? Math.max(1, i2 - i) : 0);
                return;
            } else {
                aVar.c(100.0f - f, i);
                return;
            }
        }
        if (view instanceof d) {
            d dVar = (d) view;
            if (z) {
                f = 100.0f - f;
            }
            dVar.b = f;
            dVar.postInvalidate();
        }
    }

    public void j(int i, int i2) {
        View view = this.b;
        if (!(view instanceof e)) {
            if (view instanceof a) {
                ((a) view).c(i, i2);
            }
        } else {
            e eVar = (e) view;
            if (i2 == 0) {
                eVar.setText("");
            } else {
                eVar.setRemaining(i2);
            }
        }
    }
}
