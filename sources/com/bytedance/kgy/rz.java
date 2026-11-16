package com.bytedance.kgy;

import android.content.Context;
import com.bytedance.kgy.kgy.yo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class rz {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ahm<T extends com.bytedance.kgy.kgy> {
        void kgy(ArrayList<T> arrayList, boolean z);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class ct {
        private kgy ct;
        private boolean fi;
        private boolean noq;
        private int nu;
        private final String rz;
        private boolean uq;
        private uq yo;
        private final HashMap<Class<? extends com.bytedance.kgy.kgy>, com.bytedance.kgy.ahm<? extends com.bytedance.kgy.kgy>> kgy = new HashMap<>();
        private final HashSet<String> ahm = new HashSet<>();
        private long gf = 3000;
        private int ra = 2;
        private boolean at = false;

        public abstract boolean kgy();

        public void ahm(int i) {
            if (this.uq) {
                return;
            }
            this.nu = i;
        }

        public final kgy ct() {
            return this.ct;
        }

        public long fi() {
            return this.gf;
        }

        public int gf() {
            return this.ra;
        }

        public final ct kgy(Class<? extends com.bytedance.kgy.kgy> cls, com.bytedance.kgy.ahm<? extends com.bytedance.kgy.kgy> ahmVar) {
            if (!this.uq && cls != null && ahmVar != null) {
                String strCt = ahmVar.ct();
                if (!this.ahm.contains(strCt)) {
                    this.ahm.add(strCt);
                    this.kgy.put(cls, ahmVar);
                }
            }
            return this;
        }

        public final HashMap<Class<? extends com.bytedance.kgy.kgy>, com.bytedance.kgy.ahm<? extends com.bytedance.kgy.kgy>> noq() {
            return this.kgy;
        }

        public boolean ra() {
            return this.at;
        }

        public final ct rz(boolean z) {
            if (this.uq) {
                return this;
            }
            this.fi = z;
            return this;
        }

        public ct uq(boolean z) {
            if (this.uq) {
                return this;
            }
            this.at = z;
            return this;
        }

        public final boolean yo() {
            return this.noq;
        }

        public ct(String str) {
            this.rz = str;
        }

        public final void ahm(boolean z) {
            this.uq = z;
        }

        public int rz() {
            return this.nu;
        }

        public final String uq() {
            return this.rz;
        }

        public uq ahm() {
            return this.yo;
        }

        public final ct kgy(uq uqVar) {
            if (this.uq) {
                return this;
            }
            this.yo = uqVar;
            return this;
        }

        public final ct kgy(kgy kgyVar) {
            if (this.uq) {
                return this;
            }
            this.ct = kgyVar;
            return this;
        }

        public final ct kgy(boolean z) {
            if (this.uq) {
                return this;
            }
            this.noq = z;
            return this;
        }

        public ct kgy(long j) {
            if (this.uq) {
                return this;
            }
            this.gf = j;
            return this;
        }

        public ct kgy(int i) {
            if (this.uq) {
                return this;
            }
            this.ra = i;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface kgy {
        byte[] ahm(byte[] bArr, int i);

        byte[] kgy(byte[] bArr, int i);
    }

    /* JADX INFO: renamed from: com.bytedance.kgy.rz$rz, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface InterfaceC0202rz {
        long kgy();

        void kgy(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface uq {
        ExecutorService kgy();
    }

    public static com.bytedance.kgy.uq kgy(Context context, ct ctVar) {
        yo.kgy(context);
        return new com.bytedance.kgy.kgy.ahm(context, ctVar);
    }

    public static void kgy(boolean z) {
        com.bytedance.kgy.kgy.kgy.kgy(z);
    }
}
