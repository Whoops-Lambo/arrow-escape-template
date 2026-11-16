package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.ListPopupWindow;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xh1 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ zh1 a;

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        zh1 zh1Var = this.a;
        ListPopupWindow listPopupWindow = zh1Var.e;
        if (i < 0) {
            item = !listPopupWindow.z.isShowing() ? null : listPopupWindow.c.getSelectedItem();
        } else {
            item = zh1Var.getAdapter().getItem(i);
        }
        zh1.a(zh1Var, item);
        AdapterView.OnItemClickListener onItemClickListener = zh1Var.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                view = !listPopupWindow.z.isShowing() ? null : listPopupWindow.c.getSelectedView();
                i = !listPopupWindow.z.isShowing() ? -1 : listPopupWindow.c.getSelectedItemPosition();
                j = !listPopupWindow.z.isShowing() ? Long.MIN_VALUE : listPopupWindow.c.getSelectedItemId();
            }
            onItemClickListener.onItemClick(listPopupWindow.c, view, i, j);
        }
        listPopupWindow.dismiss();
    }

    public xh1(zh1 zh1Var) {
        this.a = zh1Var;
    }
}
