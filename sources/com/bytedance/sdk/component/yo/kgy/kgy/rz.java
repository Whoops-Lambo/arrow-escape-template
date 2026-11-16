package com.bytedance.sdk.component.yo.kgy.kgy;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.yo;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class rz implements uq {
    private com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.kgy ahm;
    private com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy at;
    private com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.noq ct;
    private com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy fi;
    private com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy gf;
    private com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.uq kgy;
    private com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.ct noq;
    private com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy nu;
    private com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy ra;
    private com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.ahm rz;
    private yo uq;
    private com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy yo;

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.uq
    public void kgy(int i, List<com.bytedance.sdk.component.yo.kgy.uq.kgy> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        if (list.get(0) != null) {
            com.bytedance.sdk.component.yo.kgy.uq.kgy kgyVar = list.get(0);
            boolean z = i == 200 || i == -1;
            if (z) {
                com.bytedance.sdk.component.yo.kgy.rz.ahm.kgy(com.bytedance.sdk.component.yo.kgy.ahm.uq.uq.pft(), list.size());
            }
            if (i == -1) {
                com.bytedance.sdk.component.yo.kgy.rz.ahm.kgy(com.bytedance.sdk.component.yo.kgy.ahm.uq.uq.qdr(), list.size());
            }
            if (kgyVar.uq() == 0 && kgyVar.ct() == 1) {
                if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.kgy()) {
                    com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.uq uqVar = this.kgy;
                    if (z) {
                        uqVar.ahm(list);
                        return;
                    } else {
                        uqVar.rz(list);
                        return;
                    }
                }
                return;
            }
            if (kgyVar.uq() == 3 && kgyVar.ct() == 2) {
                if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.ct()) {
                    com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.ahm ahmVar = this.rz;
                    if (z) {
                        ahmVar.ahm(list);
                        return;
                    } else {
                        ahmVar.rz(list);
                        return;
                    }
                }
                return;
            }
            if (kgyVar.uq() == 0 && kgyVar.ct() == 2) {
                if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.ahm()) {
                    com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.kgy kgyVar2 = this.ahm;
                    if (z) {
                        kgyVar2.ahm(list);
                        return;
                    } else {
                        kgyVar2.rz(list);
                        return;
                    }
                }
                return;
            }
            if (kgyVar.uq() == 1 && kgyVar.ct() == 2) {
                if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.rz()) {
                    yo yoVar = this.uq;
                    if (z) {
                        yoVar.ahm(list);
                        return;
                    } else {
                        yoVar.rz(list);
                        return;
                    }
                }
                return;
            }
            if (kgyVar.uq() == 1 && kgyVar.ct() == 3) {
                if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.uq()) {
                    com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.noq noqVar = this.ct;
                    if (z) {
                        noqVar.ahm(list);
                        return;
                    } else {
                        noqVar.rz(list);
                        return;
                    }
                }
                return;
            }
            if (kgyVar.uq() == 2 && kgyVar.ct() == 3 && com.bytedance.sdk.component.yo.kgy.ahm.kgy.noq()) {
                com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.ct ctVar = this.noq;
                if (z) {
                    ctVar.ahm(list);
                } else {
                    ctVar.rz(list);
                }
            }
        }
    }

    public rz() {
        Context contextCt = com.bytedance.sdk.component.yo.kgy.yo.noq().ct();
        if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.kgy()) {
            this.yo = com.bytedance.sdk.component.yo.kgy.yo.noq().nu();
            this.kgy = new com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.uq(contextCt, this.yo);
        }
        if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.ct()) {
            if (com.bytedance.sdk.component.yo.kgy.yo.noq().gf() != null) {
                this.gf = com.bytedance.sdk.component.yo.kgy.yo.noq().gf();
            } else {
                this.gf = com.bytedance.sdk.component.yo.kgy.yo.noq().at();
            }
            this.rz = new com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.ahm(contextCt, this.gf);
        }
        if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.ahm()) {
            this.fi = com.bytedance.sdk.component.yo.kgy.yo.noq().at();
            this.ahm = new com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.kgy(contextCt, this.fi);
        }
        if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.rz()) {
            this.ra = com.bytedance.sdk.component.yo.kgy.yo.noq().at();
            this.uq = new yo(contextCt, this.ra);
        }
        if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.uq()) {
            this.nu = com.bytedance.sdk.component.yo.kgy.yo.noq().twf();
            this.ct = new com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.noq(contextCt, this.nu);
        }
        if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.noq()) {
            this.at = com.bytedance.sdk.component.yo.kgy.yo.noq().kus();
            this.noq = new com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.ct(contextCt, this.at);
        }
    }

    public List<com.bytedance.sdk.component.yo.kgy.uq.kgy> ahm(com.bytedance.sdk.component.yo.kgy.uq.kgy kgyVar, int i) {
        if (kgyVar.uq() == 0 && kgyVar.ct() == 1 && com.bytedance.sdk.component.yo.kgy.ahm.kgy.kgy()) {
            if (this.yo.ahm() <= i) {
                return null;
            }
            List<com.bytedance.sdk.component.yo.kgy.uq.kgy> listKgy = this.kgy.kgy(this.yo.ahm() - i, "_id");
            if (listKgy != null && listKgy.size() != 0) {
                com.bytedance.sdk.component.yo.kgy.rz.ahm.kgy(com.bytedance.sdk.component.yo.kgy.ahm.uq.uq.ft(), 1);
            }
            return listKgy;
        }
        if (kgyVar.uq() == 3 && kgyVar.ct() == 2 && com.bytedance.sdk.component.yo.kgy.ahm.kgy.ct()) {
            if (this.gf.ahm() > i) {
                return this.rz.kgy(this.gf.ahm() - i, "_id");
            }
        } else if (kgyVar.uq() == 0 && kgyVar.ct() == 2 && com.bytedance.sdk.component.yo.kgy.ahm.kgy.ahm()) {
            if (this.fi.ahm() > i) {
                List<com.bytedance.sdk.component.yo.kgy.uq.kgy> listKgy2 = this.ahm.kgy(this.fi.ahm() - i, "_id");
                if (listKgy2 != null && listKgy2.size() != 0) {
                    com.bytedance.sdk.component.yo.kgy.rz.ahm.kgy(com.bytedance.sdk.component.yo.kgy.ahm.uq.uq.wy(), 1);
                }
                return listKgy2;
            }
        } else if (kgyVar.uq() == 1 && kgyVar.ct() == 2 && com.bytedance.sdk.component.yo.kgy.ahm.kgy.rz()) {
            if (this.ra.ahm() > i) {
                List<com.bytedance.sdk.component.yo.kgy.uq.kgy> listKgy3 = this.uq.kgy(this.ra.ahm() - i, "_id");
                if (listKgy3 != null && listKgy3.size() != 0) {
                    com.bytedance.sdk.component.yo.kgy.rz.ahm.kgy(com.bytedance.sdk.component.yo.kgy.ahm.uq.uq.uf(), 1);
                }
                return listKgy3;
            }
        } else if (kgyVar.uq() == 1 && kgyVar.ct() == 3 && com.bytedance.sdk.component.yo.kgy.ahm.kgy.uq()) {
            if (this.nu.ahm() > i) {
                List<com.bytedance.sdk.component.yo.kgy.uq.kgy> listKgy4 = this.ct.kgy(this.nu.ahm() - i, "_id");
                if (listKgy4 != null && listKgy4.size() != 0) {
                    com.bytedance.sdk.component.yo.kgy.rz.ahm.kgy(com.bytedance.sdk.component.yo.kgy.ahm.uq.uq.vg(), 1);
                }
                return listKgy4;
            }
        } else if (kgyVar.uq() == 2 && kgyVar.ct() == 3 && com.bytedance.sdk.component.yo.kgy.ahm.kgy.noq() && this.at.ahm() > i) {
            return this.noq.kgy(this.at.ahm() - i, "_id");
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.uq
    public void kgy(com.bytedance.sdk.component.yo.kgy.uq.kgy kgyVar, int i) {
        if (kgyVar == null) {
            return;
        }
        try {
            kgyVar.ahm(System.currentTimeMillis());
            if (kgyVar.uq() == 0 && kgyVar.ct() == 1) {
                if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.kgy()) {
                    this.kgy.kgy(kgyVar);
                    return;
                }
                return;
            }
            if (kgyVar.uq() == 3 && kgyVar.ct() == 2) {
                if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.ct()) {
                    this.rz.kgy(kgyVar);
                    return;
                }
                return;
            }
            if (kgyVar.uq() == 0 && kgyVar.ct() == 2) {
                if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.ahm()) {
                    this.ahm.kgy(kgyVar);
                    return;
                }
                return;
            }
            if (kgyVar.uq() == 1 && kgyVar.ct() == 2) {
                if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.rz()) {
                    this.uq.kgy(kgyVar);
                }
            } else if (kgyVar.uq() == 1 && kgyVar.ct() == 3) {
                if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.uq()) {
                    this.ct.kgy(kgyVar);
                }
            } else if (kgyVar.uq() == 2 && kgyVar.ct() == 3 && com.bytedance.sdk.component.yo.kgy.ahm.kgy.noq()) {
                this.noq.kgy(kgyVar);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.yo.kgy.rz.ahm.kgy(com.bytedance.sdk.component.yo.kgy.ahm.uq.uq.uxe(), 1);
        }
    }

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.uq
    public List<com.bytedance.sdk.component.yo.kgy.uq.kgy> kgy(int i, int i2, List<String> list) {
        if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.kgy()) {
            List<com.bytedance.sdk.component.yo.kgy.uq.kgy> listKgy = this.kgy.kgy("_id");
            if (kgy(listKgy, list)) {
                listKgy.size();
                com.bytedance.sdk.component.yo.kgy.rz.ahm.kgy(com.bytedance.sdk.component.yo.kgy.ahm.uq.uq.ioy(), 1);
                return listKgy;
            }
        }
        if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.ct()) {
            List<com.bytedance.sdk.component.yo.kgy.uq.kgy> listKgy2 = this.rz.kgy("_id");
            if (kgy(listKgy2, list)) {
                listKgy2.size();
                return listKgy2;
            }
        }
        if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.ahm()) {
            List<com.bytedance.sdk.component.yo.kgy.uq.kgy> listKgy3 = this.ahm.kgy("_id");
            if (kgy(listKgy3, list)) {
                listKgy3.size();
                com.bytedance.sdk.component.yo.kgy.rz.ahm.kgy(com.bytedance.sdk.component.yo.kgy.ahm.uq.uq.lqi(), 1);
                return listKgy3;
            }
        }
        if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.rz()) {
            List<com.bytedance.sdk.component.yo.kgy.uq.kgy> listAhm = this.uq.ahm("_id");
            if (kgy(listAhm, list)) {
                listAhm.size();
                com.bytedance.sdk.component.yo.kgy.rz.ahm.kgy(com.bytedance.sdk.component.yo.kgy.ahm.uq.uq.fpz(), 1);
                return listAhm;
            }
        }
        if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.uq()) {
            List<com.bytedance.sdk.component.yo.kgy.uq.kgy> listAhm2 = this.ct.ahm("_id");
            if (kgy(listAhm2, list)) {
                listAhm2.size();
                com.bytedance.sdk.component.yo.kgy.rz.ahm.kgy(com.bytedance.sdk.component.yo.kgy.ahm.uq.uq.jpc(), 1);
                return listAhm2;
            }
        }
        if (!com.bytedance.sdk.component.yo.kgy.ahm.kgy.noq()) {
            return null;
        }
        List<com.bytedance.sdk.component.yo.kgy.uq.kgy> listAhm3 = this.noq.ahm("_id");
        if (!kgy(listAhm3, list)) {
            return null;
        }
        listAhm3.size();
        return listAhm3;
    }

    private boolean kgy(List<com.bytedance.sdk.component.yo.kgy.uq.kgy> list, List<String> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            try {
                Iterator<com.bytedance.sdk.component.yo.kgy.uq.kgy> it = list.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.yo.kgy.uq.kgy next = it.next();
                    if (next != null) {
                        String strRz = next.rz();
                        if (!TextUtils.isEmpty(strRz) && list2.contains(strRz)) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.uq
    public boolean kgy(int i, boolean z) {
        com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.ct ctVar;
        com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.noq noqVar;
        yo yoVar;
        com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.kgy kgyVar;
        com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.ahm ahmVar;
        com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.uq uqVar;
        if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.kgy() && (uqVar = this.kgy) != null && uqVar.kgy(i)) {
            com.bytedance.sdk.component.yo.kgy.rz.ahm.kgy(com.bytedance.sdk.component.yo.kgy.ahm.uq.uq.kus(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.ct() && (ahmVar = this.rz) != null && ahmVar.kgy(i)) {
            return true;
        }
        if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.ahm() && (kgyVar = this.ahm) != null && kgyVar.kgy(i)) {
            com.bytedance.sdk.component.yo.kgy.rz.ahm.kgy(com.bytedance.sdk.component.yo.kgy.ahm.uq.uq.vs(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.yo.kgy.ahm.kgy.rz() && (yoVar = this.uq) != null && yoVar.kgy(i)) {
            com.bytedance.sdk.component.yo.kgy.rz.ahm.kgy(com.bytedance.sdk.component.yo.kgy.ahm.uq.uq.dg(), 1);
            return true;
        }
        if (!com.bytedance.sdk.component.yo.kgy.ahm.kgy.uq() || (noqVar = this.ct) == null || !noqVar.kgy(i)) {
            return com.bytedance.sdk.component.yo.kgy.ahm.kgy.noq() && (ctVar = this.noq) != null && ctVar.kgy(i);
        }
        com.bytedance.sdk.component.yo.kgy.rz.ahm.kgy(com.bytedance.sdk.component.yo.kgy.ahm.uq.uq.xh(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.uq
    public void kgy(int i, long j) {
        com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.uq uqVar = this.kgy;
        if (uqVar != null) {
            uqVar.kgy(i, j);
        }
        com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.ahm ahmVar = this.rz;
        if (ahmVar != null) {
            ahmVar.kgy(i, j);
        }
        com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.kgy kgyVar = this.ahm;
        if (kgyVar != null) {
            kgyVar.kgy(i, j);
        }
        yo yoVar = this.uq;
        if (yoVar != null) {
            yoVar.kgy(i, j);
        }
        com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.noq noqVar = this.ct;
        if (noqVar != null) {
            noqVar.kgy(i, j);
        }
        com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.ct ctVar = this.noq;
        if (ctVar != null) {
            ctVar.kgy(i, j);
        }
    }
}
