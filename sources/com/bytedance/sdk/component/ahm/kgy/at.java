package com.bytedance.sdk.component.ahm.kgy;

import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.C4887nc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class at {
    public nu kgy;
    private List<String> rz;
    private long uq = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
    public com.bytedance.sdk.component.rz.kgy.kgy ahm = new com.bytedance.sdk.component.rz.kgy.kgy();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        Map<String, List<String>> ahm;
        Object ct;
        String fi;
        private List<String> gf;
        com.bytedance.sdk.component.ahm.kgy.kgy kgy;
        twf noq;
        private long ra;
        yo rz;
        String uq;
        int yo;

        public kgy ahm(String str, String str2) {
            if (!this.ahm.containsKey(str)) {
                this.ahm.put(str, new ArrayList());
            }
            this.ahm.get(str).add(str2);
            return this;
        }

        public kgy kgy() {
            return kgy(C4887nc.a, (twf) null);
        }

        public kgy(at atVar) {
            this.ra = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
            this.rz = atVar.uq();
            this.uq = atVar.ct();
            this.ahm = atVar.noq();
            this.ct = atVar.rz();
            this.noq = atVar.ra();
            this.kgy = atVar.yo();
            this.yo = atVar.gf();
            this.fi = atVar.fi();
            this.gf = atVar.kgy();
            this.ra = atVar.ahm();
        }

        public kgy kgy(com.bytedance.sdk.component.ahm.kgy.kgy kgyVar) {
            this.kgy = kgyVar;
            return this;
        }

        public kgy kgy(String str) {
            this.fi = str;
            return this;
        }

        public kgy kgy(int i) {
            this.yo = i;
            return this;
        }

        public kgy kgy(Object obj) {
            this.ct = obj;
            return this;
        }

        public kgy kgy(yo yoVar) {
            this.rz = yoVar;
            return this;
        }

        public kgy kgy(String str, String str2) {
            return ahm(str, str2);
        }

        private kgy kgy(String str, twf twfVar) {
            this.uq = str;
            this.noq = twfVar;
            return this;
        }

        public kgy kgy(twf twfVar) {
            return kgy("POST", twfVar);
        }

        public kgy kgy(List<String> list) {
            this.gf = list;
            return this;
        }

        public kgy kgy(long j) {
            this.ra = j;
            return this;
        }

        public kgy ahm(String str) {
            return kgy(yo.rz(str));
        }

        public at ahm() {
            return new at() { // from class: com.bytedance.sdk.component.ahm.kgy.at.kgy.1
                @Override // com.bytedance.sdk.component.ahm.kgy.at
                public long ahm() {
                    return kgy.this.ra;
                }

                @Override // com.bytedance.sdk.component.ahm.kgy.at
                public String ct() {
                    return kgy.this.uq;
                }

                @Override // com.bytedance.sdk.component.ahm.kgy.at
                public String fi() {
                    return kgy.this.fi;
                }

                @Override // com.bytedance.sdk.component.ahm.kgy.at
                public int gf() {
                    return kgy.this.yo;
                }

                @Override // com.bytedance.sdk.component.ahm.kgy.at
                public List<String> kgy() {
                    return kgy.this.gf;
                }

                @Override // com.bytedance.sdk.component.ahm.kgy.at
                public Map noq() {
                    return kgy.this.ahm;
                }

                @Override // com.bytedance.sdk.component.ahm.kgy.at
                public twf ra() {
                    return kgy.this.noq;
                }

                @Override // com.bytedance.sdk.component.ahm.kgy.at
                public Object rz() {
                    return kgy.this.ct;
                }

                public String toString() {
                    return "";
                }

                @Override // com.bytedance.sdk.component.ahm.kgy.at
                public yo uq() {
                    return kgy.this.rz;
                }

                @Override // com.bytedance.sdk.component.ahm.kgy.at
                public com.bytedance.sdk.component.ahm.kgy.kgy yo() {
                    return kgy.this.kgy;
                }
            };
        }

        public kgy() {
            this.ra = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
            this.ahm = new HashMap();
        }
    }

    public abstract String ct();

    public abstract String fi();

    public abstract int gf();

    public abstract Map<String, List<String>> noq();

    public twf ra() {
        return null;
    }

    public abstract Object rz();

    public abstract yo uq();

    public abstract com.bytedance.sdk.component.ahm.kgy.kgy yo();

    public long ahm() {
        return this.uq;
    }

    public List<String> kgy() {
        return this.rz;
    }

    public kgy nu() {
        return new kgy(this);
    }

    public void kgy(nu nuVar) {
        this.kgy = nuVar;
    }
}
