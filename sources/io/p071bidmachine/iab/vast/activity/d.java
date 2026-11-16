package io.p071bidmachine.iab.vast.activity;

import android.view.KeyEvent;
import com.unity3d.services.UnityAdsConstants;
import io.p071bidmachine.AdProcessCallback;
import io.p071bidmachine.core.j;
import io.p071bidmachine.iab.b;
import io.p071bidmachine.iab.mraid.p;
import io.p071bidmachine.iab.mraid.q;
import io.p071bidmachine.iab.utils.n;
import io.p071bidmachine.iab.utils.o;
import io.p071bidmachine.iab.vast.c;
import io.p071bidmachine.iab.vast.h;
import io.p071bidmachine.iab.vast.l;
import io.p071bidmachine.iab.view.a;
import io.p071bidmachine.internal.t0;
import io.p071bidmachine.internal.u0;
import io.p071bidmachine.q0;
import io.p071bidmachine.rendering.model.s0;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class d implements q, a, l {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    @Override // io.p071bidmachine.iab.mraid.q
    public void J(p pVar, String str) {
    }

    @Override // io.p071bidmachine.iab.view.a
    public void c() {
    }

    @Override // io.p071bidmachine.iab.mraid.q
    public void j(p pVar, s0 s0Var) {
    }

    @Override // io.p071bidmachine.iab.mraid.q
    public void o(p pVar, String str, n nVar) {
    }

    @Override // io.p071bidmachine.iab.mraid.q
    public void q(p pVar) {
    }

    @Override // io.p071bidmachine.iab.mraid.q
    public void v(p pVar, String str, n nVar) {
    }

    public /* synthetic */ d(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // io.p071bidmachine.iab.mraid.q
    public void E(p pVar, b bVar) {
        ((p) this.b).l(bVar);
    }

    public void a(float f, int i, int i2) {
        o oVar;
        int i3 = this.a;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        KeyEvent.Callback callback = this.b;
        switch (i3) {
            case 0:
                p pVar = (p) callback;
                VastView$C vastView$C = pVar.u;
                if (!vastView$C.i) {
                    float f3 = vastView$C.b;
                    if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        int i4 = pVar.t.e;
                        float f4 = f3 * 1000.0f;
                        float f5 = i2;
                        float f6 = f4 - f5;
                        int i5 = (int) ((f5 * 100.0f) / f4);
                        c.a(pVar.a, "Skip percent: %s", Integer.valueOf(i5));
                        if (i5 < 100 && (oVar = pVar.h) != null) {
                            oVar.j(i5, (int) Math.ceil(((double) f6) / 1000.0d));
                        }
                        if (f6 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            VastView$C vastView$C2 = pVar.u;
                            vastView$C2.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            vastView$C2.i = true;
                            pVar.setCloseControlsVisible(true);
                        }
                    }
                }
                break;
            case 1:
                p pVar2 = (p) callback;
                VastView$C vastView$C3 = pVar2.u;
                if (!vastView$C3.h || vastView$C3.c != 3) {
                    pVar2.t.getClass();
                    VastView$C vastView$C4 = pVar2.u;
                    String str = pVar2.a;
                    int i6 = vastView$C4.c;
                    if (f > i6 * 25.0f) {
                        if (i6 == 3) {
                            c.a(str, "Video at third quartile: (%s)", Float.valueOf(f));
                            pVar2.p(io.p071bidmachine.iab.vast.a.e);
                            io.p071bidmachine.iab.vast.d dVar = pVar2.w;
                            if (dVar != null) {
                                j.l(new t0((io.p071bidmachine.internal.n) dVar, 6));
                            }
                        } else if (i6 == 0) {
                            c.a(str, "Video at start: (%s)", Float.valueOf(f));
                            pVar2.p(io.p071bidmachine.iab.vast.a.b);
                            io.p071bidmachine.iab.vast.d dVar2 = pVar2.w;
                            if (dVar2 != null) {
                                float f7 = i;
                                if (!pVar2.u.f) {
                                    f2 = 1.0f;
                                }
                                j.l(new u0((io.p071bidmachine.internal.n) dVar2, f7, f2));
                            }
                        } else if (i6 == 1) {
                            c.a(str, "Video at first quartile: (%s)", Float.valueOf(f));
                            pVar2.p(io.p071bidmachine.iab.vast.a.c);
                            io.p071bidmachine.iab.vast.d dVar3 = pVar2.w;
                            if (dVar3 != null) {
                                j.l(new t0((io.p071bidmachine.internal.n) dVar3, 4));
                            }
                        } else if (i6 == 2) {
                            c.a(str, "Video at midpoint: (%s)", Float.valueOf(f));
                            pVar2.p(io.p071bidmachine.iab.vast.a.d);
                            io.p071bidmachine.iab.vast.d dVar4 = pVar2.w;
                            if (dVar4 != null) {
                                j.l(new t0((io.p071bidmachine.internal.n) dVar4, 5));
                            }
                        }
                        pVar2.u.c++;
                    }
                }
                break;
            default:
                p pVar3 = (p) callback;
                String str2 = pVar3.a;
                LinkedList linkedList = pVar3.T;
                if (linkedList.size() == 2 && ((Integer) linkedList.getFirst()).intValue() > ((Integer) linkedList.getLast()).intValue()) {
                    c.b(str2, "Playing progressing error: seek", new Object[0]);
                    linkedList.removeFirst();
                }
                if (linkedList.size() == 19) {
                    Integer num = (Integer) linkedList.getFirst();
                    int iIntValue = num.intValue();
                    Integer num2 = (Integer) linkedList.getLast();
                    int iIntValue2 = num2.intValue();
                    c.a(str2, "Playing progressing position: last=%d, first=%d)", num2, num);
                    if (iIntValue2 <= iIntValue) {
                        int i7 = pVar3.U + 1;
                        pVar3.U = i7;
                        if (i7 >= 3) {
                            pVar3.o(b.a("Playing progressing error: video hang detected"));
                        }
                    } else {
                        linkedList.removeFirst();
                    }
                }
                try {
                    linkedList.addLast(Integer.valueOf(i2));
                    if (i != 0 && i2 > 0 && pVar3.l != null) {
                        c.a(str2, "Playing progressing percent: %s", Float.valueOf(f));
                        if (pVar3.V < f) {
                            pVar3.V = f;
                            int i8 = i / 1000;
                            pVar3.l.i(f, Math.min(i8, (int) Math.ceil(i2 / 1000.0f)), i8);
                        }
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }

    @Override // io.p071bidmachine.iab.view.a
    public void b() {
        p pVar = (p) this.b;
        pVar.m(pVar.v, pVar.t, new b(5, "Close button clicked"));
    }

    public void d(h hVar) {
        io.p071bidmachine.ads.networks.vast.b bVar = ((VastActivity) this.b).e;
        if (bVar != null) {
            hVar.getClass();
            io.p071bidmachine.internal.n nVar = bVar.b;
            if (nVar != null) {
                j.l(new t0(nVar, 1));
            }
            ((AdProcessCallback) ((q0) bVar.a).a).processFinished();
        }
    }

    @Override // io.p071bidmachine.iab.mraid.q
    public void k(p pVar, b bVar) {
        p pVar2 = (p) this.b;
        c.b(pVar2.a, "handleCompanionExpired - %s", bVar);
        h hVar = pVar2.t;
        if (hVar != null) {
            hVar.j(io.p071bidmachine.iab.vast.j.j);
        }
        if (pVar2.q != null) {
            pVar2.F();
            pVar2.i(true);
        }
    }

    @Override // io.p071bidmachine.iab.mraid.q
    public void m(p pVar) {
        p pVar2 = (p) this.b;
        if (pVar2.u.j) {
            pVar2.setLoadingViewVisibility(false);
            pVar.a(null, pVar2, false);
        }
    }

    @Override // io.p071bidmachine.iab.mraid.q
    public void r(p pVar, b bVar) {
        ((p) this.b).l(bVar);
    }

    @Override // io.p071bidmachine.iab.mraid.q
    public void w(p pVar) {
        ((p) this.b).v();
    }

    @Override // io.p071bidmachine.iab.mraid.q
    public void g(p pVar, String str, n nVar) {
        nVar.a();
        p pVar2 = (p) this.b;
        p.f(pVar2, pVar2.q, str);
    }
}
