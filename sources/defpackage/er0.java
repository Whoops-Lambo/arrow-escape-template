package defpackage;

import android.content.res.Configuration;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.util.Consumer;
import androidx.fragment.app.FragmentManager;
import com.applovin.impl.m5;
import com.applovin.impl.sdk.ad.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class er0 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ er0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                FragmentManager fragmentManager = (FragmentManager) obj2;
                Configuration configuration = (Configuration) obj;
                if (fragmentManager.N()) {
                    fragmentManager.j(false, configuration);
                }
                break;
            case 1:
                FragmentManager fragmentManager2 = (FragmentManager) obj2;
                Integer num = (Integer) obj;
                if (fragmentManager2.N() && num.intValue() == 80) {
                    fragmentManager2.n(false);
                    break;
                }
                break;
            case 2:
                FragmentManager fragmentManager3 = (FragmentManager) obj2;
                MultiWindowModeChangedInfo multiWindowModeChangedInfo = (MultiWindowModeChangedInfo) obj;
                if (fragmentManager3.N()) {
                    fragmentManager3.o(multiWindowModeChangedInfo.a, false);
                }
                break;
            case 3:
                FragmentManager fragmentManager4 = (FragmentManager) obj2;
                PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo = (PictureInPictureModeChangedInfo) obj;
                if (fragmentManager4.N()) {
                    fragmentManager4.t(pictureInPictureModeChangedInfo.a, false);
                }
                break;
            default:
                ((a) obj2).o((m5) obj);
                break;
        }
    }
}
