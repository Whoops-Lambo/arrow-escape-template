package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.ViewConfigurationCompat;
import com.safedk.android.utils.Logger;
import defpackage.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@RestrictTo
public class MenuBuilder implements SupportMenu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public Callback e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public CharSequence m;
    public Drawable n;
    public View o;
    public MenuItemImpl v;
    public boolean x;
    public int l = 0;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public final ArrayList t = new ArrayList();
    public final CopyOnWriteArrayList u = new CopyOnWriteArrayList();
    public boolean w = false;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RestrictTo
    public interface Callback {
        boolean a(MenuBuilder menuBuilder, MenuItem menuItem);

        void b(MenuBuilder menuBuilder);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RestrictTo
    public interface ItemInvoker {
        boolean b(MenuItemImpl menuItemImpl);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public MenuBuilder k() {
        return this;
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = this.b.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                this.n = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        p(false);
    }

    public final void v() {
        this.p = false;
        if (this.q) {
            this.q = false;
            p(this.r);
        }
    }

    public final MenuItemImpl a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            d.r("order does not contain a valid category.");
            return null;
        }
        int i6 = (y[i5] << 16) | (65535 & i3);
        MenuItemImpl menuItemImpl = new MenuItemImpl(this, i, i2, i3, i6, charSequence, this.l);
        ArrayList arrayList = this.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((MenuItemImpl) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                arrayList.add(i4, menuItemImpl);
                p(true);
                return menuItemImpl;
            }
        }
        i4 = 0;
        arrayList.add(i4, menuItemImpl);
        p(true);
        return menuItemImpl;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItemImpl menuItemImplA = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            menuItemImplA.setIcon(resolveInfo.loadIcon(packageManager));
            menuItemImplA.g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = menuItemImplA;
            }
        }
        return size;
    }

    public final void b(MenuPresenter menuPresenter, Context context) {
        this.u.add(new WeakReference(menuPresenter));
        menuPresenter.f(context, this);
        this.k = true;
    }

    public final void c(boolean z) {
        if (this.s) {
            return;
        }
        this.s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
            if (menuPresenter == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                menuPresenter.b(this, z);
            }
        }
        this.s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        MenuItemImpl menuItemImpl = this.v;
        if (menuItemImpl != null) {
            d(menuItemImpl);
        }
        this.f.clear();
        p(true);
    }

    public boolean d(MenuItemImpl menuItemImpl) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zI = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == menuItemImpl) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
                if (menuPresenter != null) {
                    zI = menuPresenter.i(menuItemImpl);
                    if (zI) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zI) {
                this.v = null;
            }
        }
        return zI;
    }

    public boolean e(MenuBuilder menuBuilder, MenuItem menuItem) {
        Callback callback = this.e;
        return callback != null && callback.a(menuBuilder, menuItem);
    }

    public boolean f(MenuItemImpl menuItemImpl) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zC = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
            if (menuPresenter != null) {
                zC = menuPresenter.c(menuItemImpl);
                if (zC) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zC) {
            this.v = menuItemImpl;
        }
        return zC;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i2);
            if (menuItemImpl.a == i) {
                return menuItemImpl;
            }
            if (menuItemImpl.hasSubMenu() && (menuItemFindItem = menuItemImpl.o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final MenuItemImpl g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (MenuItemImpl) arrayList.get(0);
        }
        boolean zN = n();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i2);
            char c = zN ? menuItemImpl.j : menuItemImpl.h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zN && c == '\b' && i == 67))) {
                return menuItemImpl;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((MenuItemImpl) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z = this.h;
        ArrayList arrayList = this.g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList2.get(i);
            if (menuItemImpl.isVisible()) {
                arrayList.add(menuItemImpl);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z) {
        if (this.p) {
            this.q = true;
            if (z) {
                this.r = true;
                return;
            }
            return;
        }
        if (z) {
            this.h = true;
            this.k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
            if (menuPresenter == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                menuPresenter.d(z);
            }
        }
        v();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:32:0x004d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0054  */
    /* JADX WARN: Code duplicated, block: B:37:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:45:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x0075  */
    /* JADX WARN: Code duplicated, block: B:50:0x007e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00a6 A[SYNTHETIC] */
    public final boolean q(MenuItem menuItem, MenuPresenter menuPresenter, int i) {
        ActionProvider actionProvider;
        boolean zExpandActionView;
        ActionProvider actionProvider2;
        boolean z;
        SubMenuBuilder subMenuBuilder;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        MenuPresenter menuPresenter2;
        MenuItemImpl menuItemImpl = (MenuItemImpl) menuItem;
        boolean zJ = false;
        if (menuItemImpl == null || !menuItemImpl.isEnabled()) {
            return false;
        }
        MenuBuilder menuBuilder = menuItemImpl.n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = menuItemImpl.p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(menuItemImpl)) && !menuBuilder.e(menuBuilder, menuItemImpl)) {
            Intent intent = menuItemImpl.g;
            if (intent != null) {
                try {
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(menuBuilder.a, intent);
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    actionProvider = menuItemImpl.A;
                    if (actionProvider == null) {
                    }
                    zExpandActionView = false;
                    actionProvider2 = menuItemImpl.A;
                    if (actionProvider2 == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (menuItemImpl.e()) {
                        zExpandActionView |= menuItemImpl.expandActionView();
                        if (zExpandActionView) {
                            c(true);
                        }
                    } else if (menuItemImpl.hasSubMenu()) {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!menuItemImpl.hasSubMenu()) {
                            SubMenuBuilder subMenuBuilder2 = new SubMenuBuilder(this.a, this, menuItemImpl);
                            menuItemImpl.o = subMenuBuilder2;
                            subMenuBuilder2.setHeaderTitle(menuItemImpl.e);
                        }
                        subMenuBuilder = menuItemImpl.o;
                        if (z) {
                            actionProvider2.f(subMenuBuilder);
                        }
                        copyOnWriteArrayList = this.u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (menuPresenter != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                menuPresenter2 = (MenuPresenter) weakReference.get();
                                if (menuPresenter2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zJ) {
                                    zJ = menuPresenter2.j(subMenuBuilder);
                                }
                            }
                        }
                        zExpandActionView |= zJ;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    } else {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!menuItemImpl.hasSubMenu()) {
                            SubMenuBuilder subMenuBuilder3 = new SubMenuBuilder(this.a, this, menuItemImpl);
                            menuItemImpl.o = subMenuBuilder3;
                            subMenuBuilder3.setHeaderTitle(menuItemImpl.e);
                        }
                        subMenuBuilder = menuItemImpl.o;
                        if (z) {
                            actionProvider2.f(subMenuBuilder);
                        }
                        copyOnWriteArrayList = this.u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zJ = menuPresenter != null ? menuPresenter.j(subMenuBuilder) : false;
                            while (r8.hasNext()) {
                                menuPresenter2 = (MenuPresenter) weakReference.get();
                                if (menuPresenter2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zJ) {
                                    zJ = menuPresenter2.j(subMenuBuilder);
                                }
                            }
                        }
                        zExpandActionView |= zJ;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                actionProvider = menuItemImpl.A;
                if (actionProvider == null && actionProvider.e()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        actionProvider2 = menuItemImpl.A;
        if (actionProvider2 == null && actionProvider2.a()) {
            z = true;
        } else {
            z = false;
        }
        if (menuItemImpl.e()) {
            zExpandActionView |= menuItemImpl.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (menuItemImpl.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                c(false);
            }
            if (!menuItemImpl.hasSubMenu()) {
                SubMenuBuilder subMenuBuilder4 = new SubMenuBuilder(this.a, this, menuItemImpl);
                menuItemImpl.o = subMenuBuilder4;
                subMenuBuilder4.setHeaderTitle(menuItemImpl.e);
            }
            subMenuBuilder = menuItemImpl.o;
            if (z) {
                actionProvider2.f(subMenuBuilder);
            }
            copyOnWriteArrayList = this.u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (menuPresenter != null) {
                }
                while (r8.hasNext()) {
                    menuPresenter2 = (MenuPresenter) weakReference.get();
                    if (menuPresenter2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zJ) {
                        zJ = menuPresenter2.j(subMenuBuilder);
                    }
                }
            }
            zExpandActionView |= zJ;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(MenuPresenter menuPresenter) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            MenuPresenter menuPresenter2 = (MenuPresenter) weakReference.get();
            if (menuPresenter2 == null || menuPresenter2 == menuPresenter) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((MenuItemImpl) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((MenuItemImpl) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((MenuItemImpl) arrayList.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i2);
            if (menuItemImpl.b == i) {
                menuItemImpl.x = (menuItemImpl.x & (-5)) | (z2 ? 4 : 0);
                menuItemImpl.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i2);
            if (menuItemImpl.b == i) {
                menuItemImpl.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i2);
            if (menuItemImpl.b == i) {
                int i3 = menuItemImpl.x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                menuItemImpl.x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void w() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.q = false;
        this.r = false;
    }

    public MenuBuilder(Context context) {
        boolean z = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1 && ViewConfigurationCompat.e(ViewConfiguration.get(context), context)) {
            z = true;
        }
        this.d = z;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        MenuItemImpl menuItemImplA = a(i, i2, i3, charSequence);
        SubMenuBuilder subMenuBuilder = new SubMenuBuilder(this.a, this, menuItemImplA);
        menuItemImplA.o = subMenuBuilder;
        subMenuBuilder.setHeaderTitle(menuItemImplA.e);
        return subMenuBuilder;
    }

    public final void h(List list, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i3);
                if (menuItemImpl.hasSubMenu()) {
                    menuItemImpl.o.h(list, i, keyEvent);
                }
                if (zN) {
                    c = menuItemImpl.j;
                } else {
                    c = menuItemImpl.h;
                }
                if (zN) {
                    i2 = menuItemImpl.k;
                } else {
                    i2 = menuItemImpl.i;
                }
                if ((modifiers & 69647) == (i2 & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zN && c == '\b' && i == 67)) && menuItemImpl.isEnabled()) {
                        list.add(menuItemImpl);
                    }
                }
            }
        }
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (!this.k) {
            return;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zE = false;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
            if (menuPresenter == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zE |= menuPresenter.e();
            }
        }
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = this.j;
        if (zE) {
            arrayList.clear();
            arrayList2.clear();
            int size = arrayListL.size();
            for (int i = 0; i < size; i++) {
                MenuItemImpl menuItemImpl = (MenuItemImpl) arrayListL.get(i);
                if ((menuItemImpl.x & 32) == 32) {
                    arrayList.add(menuItemImpl);
                } else {
                    arrayList2.add(menuItemImpl);
                }
            }
        } else {
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(l());
        }
        this.k = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        if (g(i, keyEvent) != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean zQ;
        MenuItemImpl menuItemImplG = g(i, keyEvent);
        if (menuItemImplG != null) {
            zQ = q(menuItemImplG, null, i2);
        } else {
            zQ = false;
        }
        if ((i2 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }
}
