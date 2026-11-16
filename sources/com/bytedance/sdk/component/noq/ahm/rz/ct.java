package com.bytedance.sdk.component.noq.ahm.rz;

import android.content.Context;
import com.bytedance.sdk.component.noq.at;
import com.bytedance.sdk.component.noq.gm;
import com.bytedance.sdk.component.noq.sx;
import com.bytedance.sdk.component.noq.twf;
import com.bytedance.sdk.component.noq.um;
import com.bytedance.sdk.component.noq.xh;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class ct implements twf {
    private ExecutorService ahm;
    private um ct;
    private sx fi;
    private gm gf;
    private at kgy;
    private com.bytedance.sdk.component.noq.rz noq;
    private boolean ra;
    private com.bytedance.sdk.component.noq.uq rz;
    private xh uq;
    private com.bytedance.sdk.component.noq.ahm yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        private ExecutorService ahm;
        private um ct;
        private sx fi;
        private gm gf;
        private at kgy;
        private com.bytedance.sdk.component.noq.rz noq;
        private boolean ra;
        private com.bytedance.sdk.component.noq.uq rz;
        private xh uq;
        private com.bytedance.sdk.component.noq.ahm yo;

        public ct kgy() {
            return new ct(this);
        }

        public kgy kgy(com.bytedance.sdk.component.noq.ahm ahmVar) {
            this.yo = ahmVar;
            return this;
        }

        public kgy kgy(boolean z) {
            this.ra = z;
            return this;
        }

        public kgy kgy(gm gmVar) {
            this.gf = gmVar;
            return this;
        }

        public kgy kgy(sx sxVar) {
            this.fi = sxVar;
            return this;
        }

        public kgy kgy(com.bytedance.sdk.component.noq.uq uqVar) {
            this.rz = uqVar;
            return this;
        }
    }

    public static ct kgy(Context context) {
        return new kgy().kgy();
    }

    @Override // com.bytedance.sdk.component.noq.twf
    public sx ahm() {
        return this.fi;
    }

    @Override // com.bytedance.sdk.component.noq.twf
    public com.bytedance.sdk.component.noq.ahm ct() {
        return this.yo;
    }

    @Override // com.bytedance.sdk.component.noq.twf
    public gm noq() {
        return this.gf;
    }

    @Override // com.bytedance.sdk.component.noq.twf
    public com.bytedance.sdk.component.noq.uq rz() {
        return this.rz;
    }

    @Override // com.bytedance.sdk.component.noq.twf
    public com.bytedance.sdk.component.noq.rz uq() {
        return this.noq;
    }

    @Override // com.bytedance.sdk.component.noq.twf
    public boolean yo() {
        return this.ra;
    }

    private ct(kgy kgyVar) {
        this.kgy = kgyVar.kgy;
        this.ahm = kgyVar.ahm;
        this.rz = kgyVar.rz;
        this.uq = kgyVar.uq;
        this.ct = kgyVar.ct;
        this.noq = kgyVar.noq;
        this.yo = kgyVar.yo;
        this.fi = kgyVar.fi;
        this.gf = kgyVar.gf;
        this.ra = kgyVar.ra;
    }

    @Override // com.bytedance.sdk.component.noq.twf
    public ExecutorService kgy() {
        return this.ahm;
    }
}
