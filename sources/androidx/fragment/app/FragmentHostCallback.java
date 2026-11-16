package androidx.fragment.app;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/fragment/app/FragmentHostCallback;", "H", "Landroidx/fragment/app/FragmentContainer;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class FragmentHostCallback<H> extends FragmentContainer {
    public final FragmentActivity a;
    public final FragmentActivity b;
    public final Handler c;
    public final FragmentManager d;

    @Override // androidx.fragment.app.FragmentContainer
    public View b(int i) {
        return null;
    }

    @Override // androidx.fragment.app.FragmentContainer
    public boolean c() {
        return true;
    }

    public void d(PrintWriter printWriter, String[] strArr) {
    }

    public abstract FragmentActivity e();

    public void h() {
    }

    public FragmentHostCallback(FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.a = fragmentActivity;
        this.b = fragmentActivity;
        this.c = handler;
        this.d = new FragmentManagerImpl();
    }

    public LayoutInflater f() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.b);
        layoutInflaterFrom.getClass();
        return layoutInflaterFrom;
    }

    public boolean g(String str) {
        str.getClass();
        return false;
    }
}
