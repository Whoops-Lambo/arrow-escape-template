package com.bytedance.adsdk.ahm.kgy.kgy;

import android.annotation.TargetApi;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@TargetApi(19)
public class at implements ra, twf {
    private final com.bytedance.adsdk.ahm.rz.ahm.gf noq;
    private final String uq;
    private final Path kgy = new Path();
    private final Path ahm = new Path();
    private final Path rz = new Path();
    private final List<twf> ct = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.adsdk.ahm.kgy.kgy.at$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] kgy;

        static {
            int[] iArr = new int[com.bytedance.adsdk.ahm.rz.ahm.gf.kgy.values().length];
            kgy = iArr;
            try {
                iArr[com.bytedance.adsdk.ahm.rz.ahm.gf.kgy.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                kgy[com.bytedance.adsdk.ahm.rz.ahm.gf.kgy.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                kgy[com.bytedance.adsdk.ahm.rz.ahm.gf.kgy.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                kgy[com.bytedance.adsdk.ahm.rz.ahm.gf.kgy.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                kgy[com.bytedance.adsdk.ahm.rz.ahm.gf.kgy.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @TargetApi(19)
    private void kgy(Path.Op op) {
        List<twf> list;
        this.ahm.reset();
        this.kgy.reset();
        int size = this.ct.size();
        while (true) {
            size--;
            list = this.ct;
            if (size <= 0) {
                break;
            }
            twf twfVar = list.get(size);
            if (twfVar instanceof uq) {
                uq uqVar = (uq) twfVar;
                List<twf> listAhm = uqVar.ahm();
                for (int size2 = listAhm.size() - 1; size2 >= 0; size2--) {
                    Path pathUq = listAhm.get(size2).uq();
                    pathUq.transform(uqVar.rz());
                    this.ahm.addPath(pathUq);
                }
            } else {
                this.ahm.addPath(twfVar.uq());
            }
        }
        twf twfVar2 = list.get(0);
        if (twfVar2 instanceof uq) {
            uq uqVar2 = (uq) twfVar2;
            List<twf> listAhm2 = uqVar2.ahm();
            for (int i = 0; i < listAhm2.size(); i++) {
                Path pathUq2 = listAhm2.get(i).uq();
                pathUq2.transform(uqVar2.rz());
                this.kgy.addPath(pathUq2);
            }
        } else {
            this.kgy.set(twfVar2.uq());
        }
        this.rz.op(this.kgy, this.ahm, op);
    }

    @Override // com.bytedance.adsdk.ahm.kgy.kgy.twf
    public Path uq() {
        this.rz.reset();
        if (this.noq.rz()) {
            return this.rz;
        }
        int i = AnonymousClass1.kgy[this.noq.ahm().ordinal()];
        if (i == 1) {
            kgy();
        } else if (i == 2) {
            kgy(Path.Op.UNION);
        } else if (i == 3) {
            kgy(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            kgy(Path.Op.INTERSECT);
        } else if (i == 5) {
            kgy(Path.Op.XOR);
        }
        return this.rz;
    }

    public at(com.bytedance.adsdk.ahm.rz.ahm.gf gfVar) {
        this.uq = gfVar.kgy();
        this.noq = gfVar;
    }

    @Override // com.bytedance.adsdk.ahm.kgy.kgy.rz
    public void kgy(List<rz> list, List<rz> list2) {
        for (int i = 0; i < this.ct.size(); i++) {
            this.ct.get(i).kgy(list, list2);
        }
    }

    private void kgy() {
        for (int i = 0; i < this.ct.size(); i++) {
            this.rz.addPath(this.ct.get(i).uq());
        }
    }

    @Override // com.bytedance.adsdk.ahm.kgy.kgy.ra
    public void kgy(ListIterator<rz> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            rz rzVarPrevious = listIterator.previous();
            if (rzVarPrevious instanceof twf) {
                this.ct.add((twf) rzVarPrevious);
                listIterator.remove();
            }
        }
    }
}
