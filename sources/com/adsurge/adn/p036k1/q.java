package com.adsurge.adn.p036k1;

import com.adsurge.adn.lib.callback.ARCallback;
import com.adsurge.adn.lib.callback.DialogStateCallback;
import com.adsurge.adn.lib.callback.EndCardShownCallback;
import com.adsurge.adn.lib.dysi.IGDTBiz;
import com.adsurge.adn.p018e1.d;
import com.adsurge.adn.p018e1.f;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class q extends o {
    public final boolean q;
    public boolean r;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends d {
        public a(f fVar) {
            super(fVar);
        }

        public void a(com.adsurge.adn.u1.a aVar) {
            q qVar = q.this;
            if (qVar.j == null) {
                return;
            }
            qVar.a(aVar);
        }

        @Override // com.adsurge.adn.p018e1.d
        public /* bridge */ /* synthetic */ void b(Object obj) {
            com.adsurge.adn.F.c.a(obj);
            a((com.adsurge.adn.u1.a) null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b extends d {
        public b(f fVar) {
            super(fVar);
        }

        @Override // com.adsurge.adn.p018e1.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(Integer num) {
            IGDTBiz iGDTBizI = q.this.i();
            if (iGDTBizI == null) {
                return;
            }
            iGDTBizI.onDialogShow(num.intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c extends d {
        public c(f fVar) {
            super(fVar);
        }

        @Override // com.adsurge.adn.p018e1.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(Integer num) {
            IGDTBiz iGDTBizI = q.this.i();
            if (iGDTBizI == null) {
                return;
            }
            iGDTBizI.onDialogDismiss(num.intValue());
        }
    }

    public final void a(com.adsurge.adn.u1.c cVar) {
        if (cVar == null) {
            return;
        }
        DialogStateCallback dialogStateCallback = (DialogStateCallback) com.adsurge.adn.p018e1.a.b(cVar.t(), DialogStateCallback.class);
        dialogStateCallback.onShow().a((d) new b(this));
        dialogStateCallback.onDismiss().a((d) new c(this));
    }

    public boolean o() {
        return this.r;
    }

    public void p() {
        if (this.r) {
            return;
        }
        this.r = true;
        f.a(this, this.b);
        ((EndCardShownCallback) com.adsurge.adn.p018e1.a.b(this.b.d(), EndCardShownCallback.class)).onEndCardShown().a();
    }

    public final void q() {
        ((ARCallback) com.adsurge.adn.p018e1.a.b(this.b.t(), ARCallback.class)).onExecuteRule().a((d) new a(this));
    }

    public q(com.adsurge.adn.p064w0.b bVar, com.adsurge.adn.u1.c cVar, boolean z) {
        super(bVar, cVar, cVar.a0());
        this.r = false;
        this.q = z;
        n();
        a(cVar);
        q();
        m.a(cVar.i(), cVar.a0().j(), z, false);
    }

    public void b(int i) {
        IGDTBiz iGDTBizI = i();
        if (iGDTBizI == null) {
            return;
        }
        iGDTBizI.onReward(i);
    }

    @Override // com.adsurge.adn.p036k1.o
    public void c() {
        super.c();
        com.adsurge.adn.p018e1.a.c(this.b.t(), ARCallback.class);
        com.adsurge.adn.p018e1.a.c(this.b.d(), EndCardShownCallback.class);
    }

    public void d(String str) {
        IGDTBiz iGDTBizI = i();
        if (iGDTBizI == null) {
            return;
        }
        iGDTBizI.onPageLoadStart(str);
    }

    public void c(int i) {
        IGDTBiz iGDTBizI = i();
        if (iGDTBizI == null) {
            return;
        }
        iGDTBizI.onPageLoadEnd(String.valueOf(i));
    }

    public void c(String str) {
        IGDTBiz iGDTBizI = i();
        if (iGDTBizI == null) {
            return;
        }
        iGDTBizI.onPageLoadEnd(str);
    }

    public final void a(com.adsurge.adn.u1.a aVar) {
        this.j.a(aVar);
    }

    @Override // com.adsurge.adn.p036k1.o
    public void a(p pVar) {
        super.a(pVar);
    }

    public void a(int i) {
        IGDTBiz iGDTBizI = i();
        if (iGDTBizI == null) {
            return;
        }
        iGDTBizI.onNativeAdClick(i);
    }
}
