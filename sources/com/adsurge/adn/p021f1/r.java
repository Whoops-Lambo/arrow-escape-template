package com.adsurge.adn.p021f1;

import com.adsurge.adn.I0.g;
import com.adsurge.adn.I0.m;
import com.adsurge.adn.p024g1.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class r implements j {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public final /* synthetic */ f a;

        public a(f fVar) {
            this.a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder sb = new StringBuilder("渲染方式：");
            int iB = this.a.t.b();
            if (iB == 0) {
                sb.append("自渲染");
            } else if (iB == 1) {
                sb.append("模板1.0");
            } else if (iB == 3) {
                sb.append("原生化");
            } else if (iB != 10) {
                sb.append("未知");
            } else {
                sb.append("原生");
            }
            sb.append("\ncomponentId=");
            sb.append(this.a.u);
            sb.append('\n');
            m.e(sb.toString());
        }
    }

    @Override // com.adsurge.adn.p021f1.j
    public boolean a(f fVar, b bVar) {
        g.c(new a(fVar));
        return false;
    }

    @Override // com.adsurge.adn.p021f1.j
    public boolean a(f fVar) {
        return true;
    }

    @Override // com.adsurge.adn.p021f1.j
    public int a() {
        return -2;
    }
}
