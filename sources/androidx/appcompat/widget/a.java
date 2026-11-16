package androidx.appcompat.widget;

import androidx.appcompat.view.menu.MenuItemImpl;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((TooltipCompatHandler) obj).c(false);
                break;
            case 1:
                ((TooltipCompatHandler) obj).a();
                break;
            default:
                Toolbar.ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = ((Toolbar) obj).M;
                MenuItemImpl menuItemImpl = expandedActionViewMenuPresenter == null ? null : expandedActionViewMenuPresenter.b;
                if (menuItemImpl != null) {
                    menuItemImpl.collapseActionView();
                }
                break;
        }
    }
}
