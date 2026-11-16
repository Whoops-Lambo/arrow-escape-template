package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@RestrictTo
public abstract class BaseMenuPresenter implements MenuPresenter {
    public Context a;
    public Context b;
    public MenuBuilder c;
    public LayoutInflater d;
    public MenuPresenter.Callback e;
    public int f;
    public int g;
    public MenuView h;

    public abstract void a(MenuItemImpl menuItemImpl, MenuView.ItemView itemView);

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean c(MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean i(MenuItemImpl menuItemImpl) {
        return false;
    }

    public boolean l(MenuItemImpl menuItemImpl) {
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void b(MenuBuilder menuBuilder, boolean z) {
        MenuPresenter.Callback callback = this.e;
        if (callback != null) {
            callback.b(menuBuilder, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void d(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.h;
        if (viewGroup == null) {
            return;
        }
        MenuBuilder menuBuilder = this.c;
        int i = 0;
        if (menuBuilder != null) {
            menuBuilder.i();
            ArrayList arrayListL = this.c.l();
            int size = arrayListL.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                MenuItemImpl menuItemImpl = (MenuItemImpl) arrayListL.get(i3);
                if (l(menuItemImpl)) {
                    View childAt = viewGroup.getChildAt(i2);
                    MenuItemImpl itemData = childAt instanceof MenuView.ItemView ? ((MenuView.ItemView) childAt).getItemData() : null;
                    View viewK = k(menuItemImpl, childAt, viewGroup);
                    if (menuItemImpl != itemData) {
                        viewK.setPressed(false);
                        viewK.jumpDrawablesToCurrentState();
                    }
                    if (viewK != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) viewK.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewK);
                        }
                        ((ViewGroup) this.h).addView(viewK, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!g(viewGroup, i)) {
                i++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void f(Context context, MenuBuilder menuBuilder) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = menuBuilder;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean j(SubMenuBuilder subMenuBuilder) {
        MenuPresenter.Callback callback = this.e;
        MenuBuilder menuBuilder = subMenuBuilder;
        if (callback == null) {
            return false;
        }
        if (subMenuBuilder == null) {
            menuBuilder = this.c;
        }
        return callback.c(menuBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View k(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        MenuView.ItemView itemView = view instanceof MenuView.ItemView ? (MenuView.ItemView) view : (MenuView.ItemView) this.d.inflate(this.g, viewGroup, false);
        a(menuItemImpl, itemView);
        return (View) itemView;
    }

    public boolean g(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }
}
