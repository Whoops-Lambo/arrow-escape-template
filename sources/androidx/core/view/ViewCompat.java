package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.RecyclerView;
import com.ecffri.arrows.R;
import com.ironsource.C4664b4;
import defpackage.jo2;
import defpackage.z53;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class ViewCompat {
    public static WeakHashMap a;
    public static Field b;
    public static boolean c;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final z53 e = new z53();
    public static final AccessibilityPaneVisibilityManager f = new AccessibilityPaneVisibilityManager();

    /* JADX INFO: renamed from: androidx.core.view.ViewCompat$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    class AnonymousClass1 extends AccessibilityViewProperty<Boolean> {
        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final void b(View view, Object obj) {
            Api28Impl.f(view, ((Boolean) obj).booleanValue());
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final boolean e(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            Boolean bool2 = (Boolean) obj2;
            return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final Object a(View view) {
            return Boolean.valueOf(Api28Impl.c(view));
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.ViewCompat$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    class AnonymousClass2 extends AccessibilityViewProperty<CharSequence> {
        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final void b(View view, Object obj) {
            Api28Impl.e(view, (CharSequence) obj);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final boolean e(Object obj, Object obj2) {
            return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final Object a(View view) {
            return Api28Impl.a(view);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.ViewCompat$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    class AnonymousClass3 extends AccessibilityViewProperty<CharSequence> {
        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final void b(View view, Object obj) {
            Api30Impl.b(view, (CharSequence) obj);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final boolean e(Object obj, Object obj2) {
            return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final Object a(View view) {
            return Api30Impl.a(view);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.ViewCompat$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    class AnonymousClass4 extends AccessibilityViewProperty<Boolean> {
        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final void b(View view, Object obj) {
            Api28Impl.d(view, ((Boolean) obj).booleanValue());
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final boolean e(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            Boolean bool2 = (Boolean) obj2;
            return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final Object a(View view) {
            return Boolean.valueOf(Api28Impl.b(view));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AccessibilityPaneVisibilityManager implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        public final WeakHashMap a = new WeakHashMap();

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry entry : this.a.entrySet()) {
                    View view = (View) entry.getKey();
                    boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                    boolean z = view.isShown() && view.getWindowVisibility() == 0;
                    if (zBooleanValue != z) {
                        ViewCompat.s(z ? 16 : 32, view);
                        entry.setValue(Boolean.valueOf(z));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class AccessibilityViewProperty<T> {
        public final int a;
        public final Class b;
        public final int c;
        public final int d;

        public abstract Object a(View view);

        public abstract void b(View view, Object obj);

        public final Object c(View view) {
            if (Build.VERSION.SDK_INT >= this.c) {
                return a(view);
            }
            Object tag = view.getTag(this.a);
            if (this.b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public final void d(View view, Object obj) {
            if (Build.VERSION.SDK_INT >= this.c) {
                b(view, obj);
                return;
            }
            if (e(c(view), obj)) {
                AccessibilityDelegateCompat accessibilityDelegateCompatE = ViewCompat.e(view);
                if (accessibilityDelegateCompatE == null) {
                    accessibilityDelegateCompatE = new AccessibilityDelegateCompat();
                }
                ViewCompat.z(view, accessibilityDelegateCompatE);
                view.setTag(this.a, obj);
                ViewCompat.s(this.d, view);
            }
        }

        public AccessibilityViewProperty(int i, Class cls, int i2, int i3) {
            this.a = i;
            this.b = cls;
            this.d = i2;
            this.c = i3;
        }

        public boolean e(Object obj, Object obj2) {
            return !obj2.equals(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api21Impl {
        public static void m(@NonNull final View view, @Nullable final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, onApplyWindowInsetsListener);
            }
            if (onApplyWindowInsetsListener == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.ViewCompat.Api21Impl.1
                    public WindowInsetsCompat a = null;

                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view2);
                        int i = Build.VERSION.SDK_INT;
                        OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener;
                        if (i < 30) {
                            Api21Impl.a(windowInsets, view);
                            if (windowInsetsCompat.equals(this.a)) {
                                return onApplyWindowInsetsListener2.c(view2, windowInsetsCompat).toWindowInsets();
                            }
                        }
                        this.a = windowInsetsCompat;
                        WindowInsetsCompat windowInsetsCompatC = onApplyWindowInsetsListener2.c(view2, windowInsetsCompat);
                        if (i >= 30) {
                            return windowInsetsCompatC.toWindowInsets();
                        }
                        WeakHashMap weakHashMap = ViewCompat.a;
                        Api20Impl.c(view2);
                        return windowInsetsCompatC.toWindowInsets();
                    }
                });
            }
        }

        public static void a(@NonNull WindowInsets windowInsets, @NonNull View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static WindowInsetsCompat b(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Rect rect) {
            WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            if (windowInsets != null) {
                return WindowInsetsCompat.toWindowInsetsCompat(view.computeSystemWindowInsets(windowInsets, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        public static ColorStateList c(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode d(View view) {
            return view.getBackgroundTintMode();
        }

        public static float e(View view) {
            return view.getElevation();
        }

        public static String f(View view) {
            return view.getTransitionName();
        }

        public static float g(View view) {
            return view.getTranslationZ();
        }

        public static float h(@NonNull View view) {
            return view.getZ();
        }

        public static boolean i(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void j(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void k(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void l(View view, float f) {
            view.setElevation(f);
        }

        public static void n(View view, String str) {
            view.setTransitionName(str);
        }

        public static void o(View view, float f) {
            view.setTranslationZ(f);
        }

        public static void p(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static final class Api31Impl {
        @Nullable
        public static ContentInfoCompat b(@NonNull View view, @NonNull ContentInfoCompat contentInfoCompat) {
            ContentInfo contentInfoA = contentInfoCompat.a.a();
            Objects.requireNonNull(contentInfoA);
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoA);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoA ? contentInfoCompat : new ContentInfoCompat(new ContentInfoCompat.Compat31Impl(contentInfoPerformReceiveContent));
        }

        @Nullable
        public static String[] a(@NonNull View view) {
            return view.getReceiveContentMimeTypes();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FocusDirection {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FocusRealDirection {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FocusRelativeDirection {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface NestedScrollType {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static final class OnReceiveContentListenerAdapter implements android.view.OnReceiveContentListener {
        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            new ContentInfoCompat.Compat31Impl(contentInfo);
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OnUnhandledKeyEventListenerCompat {
        boolean a();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ScrollAxis {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ScrollIndicators {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class UnhandledKeyEventManager {
        public static final ArrayList d = new ArrayList();
        public WeakHashMap a;
        public SparseArray b;
        public WeakReference c;

        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View viewA = a(viewGroup.getChildAt(childCount), keyEvent);
                    if (viewA != null) {
                        return viewA;
                    }
                }
            }
            if (b(view, keyEvent)) {
                return view;
            }
            return null;
        }

        public static boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((OnUnhandledKeyEventListenerCompat) arrayList.get(size)).a()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
    }

    public static void J(ViewGroup viewGroup, int i) {
        Api23Impl.b(viewGroup, i, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ContentInfoCompat u(View view, ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + contentInfoCompat + ", view=" + view.getClass().getSimpleName() + C4664b4.j.d + view.getId() + C4664b4.j.e);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.b(view, contentInfoCompat);
        }
        OnReceiveContentListener onReceiveContentListener = (OnReceiveContentListener) view.getTag(R.id.tag_on_receive_content_listener);
        OnReceiveContentViewBehavior onReceiveContentViewBehavior = e;
        if (onReceiveContentListener == null) {
            if (view instanceof OnReceiveContentViewBehavior) {
                onReceiveContentViewBehavior = (OnReceiveContentViewBehavior) view;
            }
            return onReceiveContentViewBehavior.a(contentInfoCompat);
        }
        ContentInfoCompat contentInfoCompatA = onReceiveContentListener.a(view, contentInfoCompat);
        if (contentInfoCompatA == null) {
            return null;
        }
        if (view instanceof OnReceiveContentViewBehavior) {
            onReceiveContentViewBehavior = (OnReceiveContentViewBehavior) view;
        }
        return onReceiveContentViewBehavior.a(contentInfoCompatA);
    }

    public static void w(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, AccessibilityViewCommand accessibilityViewCommand) {
        if (accessibilityViewCommand == null) {
            v(accessibilityActionCompat.a(), view);
            s(0, view);
            return;
        }
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat2 = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(null, accessibilityActionCompat.b, null, accessibilityViewCommand, accessibilityActionCompat.c);
        AccessibilityDelegateCompat accessibilityDelegateCompatE = e(view);
        if (accessibilityDelegateCompatE == null) {
            accessibilityDelegateCompatE = new AccessibilityDelegateCompat();
        }
        z(view, accessibilityDelegateCompatE);
        v(accessibilityActionCompat2.a(), view);
        h(view).add(accessibilityActionCompat2);
        s(0, view);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api20Impl {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api23Impl {
        @Nullable
        public static WindowInsetsCompat a(@NonNull View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(rootWindowInsets);
            windowInsetsCompat.setRootWindowInsets(windowInsetsCompat);
            windowInsetsCompat.copyRootViewBounds(view.getRootView());
            return windowInsetsCompat;
        }

        public static void b(@NonNull View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api24Impl {
        public static void a(@NonNull View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api26Impl {
        public static int a(View view) {
            return view.getImportantForAutofill();
        }

        public static void b(View view, int i) {
            view.setImportantForAutofill(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api28Impl {
        public static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void d(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        public static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void f(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api29Impl {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static void b(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api30Impl {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public static void A(View view, boolean z) {
        new AnonymousClass4(R.id.tag_accessibility_heading, Boolean.class, 0, 28).d(view, Boolean.valueOf(z));
    }

    public static void B(View view, CharSequence charSequence) {
        new AnonymousClass2(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).d(view, charSequence);
        AccessibilityPaneVisibilityManager accessibilityPaneVisibilityManager = f;
        if (charSequence == null) {
            accessibilityPaneVisibilityManager.a.remove(view);
            view.removeOnAttachStateChangeListener(accessibilityPaneVisibilityManager);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(accessibilityPaneVisibilityManager);
        } else {
            accessibilityPaneVisibilityManager.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(accessibilityPaneVisibilityManager);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(accessibilityPaneVisibilityManager);
            }
        }
    }

    public static void F(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.b(viewGroup, i);
        }
    }

    public static void H(jo2 jo2Var, PointerIconCompat pointerIconCompat) {
        Api24Impl.a(jo2Var, pointerIconCompat.a);
    }

    public static void I(View view, boolean z) {
        new AnonymousClass1(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28).d(view, Boolean.valueOf(z));
    }

    public static void K(SwitchCompat switchCompat, CharSequence charSequence) {
        new AnonymousClass3(R.id.tag_state_description, CharSequence.class, 64, 30).d(switchCompat, charSequence);
    }

    public static void N(View view, WindowInsetsAnimationCompat.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(callback != null ? new WindowInsetsAnimationCompat.Impl30.ProxyCallback(callback) : null);
            return;
        }
        PathInterpolator pathInterpolator = WindowInsetsAnimationCompat.Impl21.e;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (callback == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener impl21OnApplyWindowInsetsListener = new WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener(view, callback);
        view.setTag(R.id.tag_window_insets_animation_callback, impl21OnApplyWindowInsetsListener);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(impl21OnApplyWindowInsetsListener);
        }
    }

    public static ViewPropertyAnimatorCompat a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat) a.get(view);
        if (viewPropertyAnimatorCompat != null) {
            return viewPropertyAnimatorCompat;
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = new ViewPropertyAnimatorCompat(view);
        a.put(view, viewPropertyAnimatorCompat2);
        return viewPropertyAnimatorCompat2;
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = UnhandledKeyEventManager.d;
        UnhandledKeyEventManager unhandledKeyEventManager = (UnhandledKeyEventManager) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (unhandledKeyEventManager == null) {
            unhandledKeyEventManager = new UnhandledKeyEventManager();
            unhandledKeyEventManager.a = null;
            unhandledKeyEventManager.b = null;
            unhandledKeyEventManager.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, unhandledKeyEventManager);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = unhandledKeyEventManager.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = UnhandledKeyEventManager.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (unhandledKeyEventManager.a == null) {
                            unhandledKeyEventManager.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = UnhandledKeyEventManager.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                unhandledKeyEventManager.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    unhandledKeyEventManager.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewA = unhandledKeyEventManager.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (unhandledKeyEventManager.b == null) {
                    unhandledKeyEventManager.b = new SparseArray();
                }
                unhandledKeyEventManager.b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate f(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static CharSequence g(View view) {
        return (CharSequence) new AnonymousClass2(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).c(view);
    }

    public static int l(RecyclerView recyclerView) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.a(recyclerView);
        }
        return 0;
    }

    public static String[] m(AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.a(appCompatEditText) : (String[]) appCompatEditText.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void y(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void z(View view, AccessibilityDelegateCompat accessibilityDelegateCompat) {
        if (accessibilityDelegateCompat == null && (f(view) instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter)) {
            accessibilityDelegateCompat = new AccessibilityDelegateCompat();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(accessibilityDelegateCompat == null ? null : accessibilityDelegateCompat.b);
    }

    public static void C(View view, ColorStateList colorStateList) {
        Api21Impl.j(view, colorStateList);
    }

    public static void D(View view, PorterDuff.Mode mode) {
        Api21Impl.k(view, mode);
    }

    public static void E(View view, float f2) {
        Api21Impl.l(view, f2);
    }

    public static void G(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        Api21Impl.m(view, onApplyWindowInsetsListener);
    }

    public static void L(View view, String str) {
        Api21Impl.n(view, str);
    }

    public static void M(View view, float f2) {
        Api21Impl.o(view, f2);
    }

    public static void b(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
        Api21Impl.b(view, windowInsetsCompat, rect);
    }

    public static WindowInsetsCompat c(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets windowInsetsA = Api20Impl.a(view, windowInsets);
            if (!windowInsetsA.equals(windowInsets)) {
                return WindowInsetsCompat.toWindowInsetsCompat(windowInsetsA, view);
            }
        }
        return windowInsetsCompat;
    }

    public static AccessibilityDelegateCompat e(View view) {
        View.AccessibilityDelegate accessibilityDelegateF = f(view);
        if (accessibilityDelegateF == null) {
            return null;
        }
        if (accessibilityDelegateF instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter) {
            return ((AccessibilityDelegateCompat.AccessibilityDelegateAdapter) accessibilityDelegateF).a;
        }
        return new AccessibilityDelegateCompat(accessibilityDelegateF);
    }

    public static ArrayList h(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static ColorStateList i(View view) {
        return Api21Impl.c(view);
    }

    public static PorterDuff.Mode j(View view) {
        return Api21Impl.d(view);
    }

    public static float k(View view) {
        return Api21Impl.e(view);
    }

    public static WindowInsetsCompat n(View view) {
        return Api23Impl.a(view);
    }

    public static String o(View view) {
        return Api21Impl.f(view);
    }

    public static float p(View view) {
        return Api21Impl.g(view);
    }

    public static float q(View view) {
        return Api21Impl.h(view);
    }

    public static boolean r(View view) {
        return Api21Impl.i(view);
    }

    public static void s(int i, View view) {
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (g(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            int i2 = 32;
            if (view.getAccessibilityLiveRegion() == 0 && !z) {
                if (i == 32) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    view.onInitializeAccessibilityEvent(accessibilityEventObtain);
                    accessibilityEventObtain.setEventType(32);
                    accessibilityEventObtain.setContentChangeTypes(i);
                    accessibilityEventObtain.setSource(view);
                    view.onPopulateAccessibilityEvent(accessibilityEventObtain);
                    accessibilityEventObtain.getText().add(g(view));
                    accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
                    return;
                }
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            if (!z) {
                i2 = 2048;
            }
            accessibilityEventObtain2.setEventType(i2);
            accessibilityEventObtain2.setContentChangeTypes(i);
            if (z) {
                accessibilityEventObtain2.getText().add(g(view));
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
            }
            view.sendAccessibilityEventUnchecked(accessibilityEventObtain2);
        }
    }

    public static WindowInsetsCompat t(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets windowInsetsB = Api20Impl.b(view, windowInsets);
            if (!windowInsetsB.equals(windowInsets)) {
                return WindowInsetsCompat.toWindowInsetsCompat(windowInsetsB, view);
            }
        }
        return windowInsetsCompat;
    }

    public static void v(int i, View view) {
        ArrayList arrayListH = h(view);
        for (int i2 = 0; i2 < arrayListH.size(); i2++) {
            if (((AccessibilityNodeInfoCompat.AccessibilityActionCompat) arrayListH.get(i2)).a() == i) {
                arrayListH.remove(i2);
                return;
            }
        }
    }

    public static void x(View view) {
        Api20Impl.c(view);
    }
}
