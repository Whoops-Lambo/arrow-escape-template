package defpackage;

import com.facebook.share.model.SharePhoto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class qe2 extends de2 {
    public final ArrayList g = new ArrayList();

    public final void a(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SharePhoto sharePhoto = (SharePhoto) it.next();
                if (sharePhoto != null) {
                    pe2 pe2Var = new pe2(2);
                    pe2Var.u(sharePhoto);
                    this.g.add(new SharePhoto(pe2Var));
                }
            }
        }
    }
}
