package io.p071bidmachine.iab.vast.activity;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                p pVar = (p) obj;
                if (pVar.C()) {
                    pVar.q();
                }
                break;
            case 1:
                p pVar2 = (p) obj;
                String str = pVar2.a;
                try {
                    if (pVar2.C() && pVar2.n.isPlaying()) {
                        int duration = pVar2.n.getDuration();
                        int currentPosition = pVar2.n.getCurrentPosition();
                        if (currentPosition > 0) {
                            float f = (currentPosition * 100.0f) / duration;
                            pVar2.R.a(f, duration, currentPosition);
                            pVar2.S.a(f, duration, currentPosition);
                            pVar2.W.a(f, duration, currentPosition);
                            if (f > 105.0f) {
                                io.p071bidmachine.iab.vast.c.b(str, "Playback tracking: video hang detected", new Object[0]);
                                p.w(pVar2);
                            }
                        }
                    }
                } catch (Exception e) {
                    io.p071bidmachine.iab.vast.c.b(str, "Playback tracking exception: %s", e.getMessage());
                }
                pVar2.postDelayed(this, 16L);
                break;
            default:
                n nVar = (n) obj;
                nVar.a(nVar.d);
                break;
        }
    }
}
