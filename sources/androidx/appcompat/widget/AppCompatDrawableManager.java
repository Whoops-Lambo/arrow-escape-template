package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.ecffri.arrows.R;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@RestrictTo
public final class AppCompatDrawableManager {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static AppCompatDrawableManager c;
    public ResourceManagerInternal a;

    public final synchronized Drawable b(Context context, int i) {
        return this.a.d(context, i);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatDrawableManager$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes7.dex */
    class AnonymousClass1 implements ResourceManagerInternal.ResourceManagerHooks {
        public final int[] a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        public final int[] b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        public final int[] c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        public final int[] d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        public final int[] e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        public final int[] f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int i, int[] iArr) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(Context context, int i) {
            int iC = ThemeUtils.c(context, R.attr.colorControlHighlight);
            int iB = ThemeUtils.b(context, R.attr.colorButtonNormal);
            int[] iArr = ThemeUtils.b;
            int[] iArr2 = ThemeUtils.d;
            int iD = ColorUtils.d(iC, i);
            return new ColorStateList(new int[][]{iArr, iArr2, ThemeUtils.c, ThemeUtils.f}, new int[]{iB, iD, ColorUtils.d(iC, i), i});
        }

        public static LayerDrawable c(ResourceManagerInternal resourceManagerInternal, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableD = resourceManagerInternal.d(context, R.drawable.abc_star_black_48dp);
            Drawable drawableD2 = resourceManagerInternal.d(context, R.drawable.abc_star_half_black_48dp);
            if ((drawableD instanceof BitmapDrawable) && drawableD.getIntrinsicWidth() == dimensionPixelSize && drawableD.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableD;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableD.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableD.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableD2 instanceof BitmapDrawable) && drawableD2.getIntrinsicWidth() == dimensionPixelSize && drawableD2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableD2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableD2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableD2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            layerDrawable.setId(2, android.R.id.progress);
            return layerDrawable;
        }

        public static void e(Drawable drawable, int i, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = AppCompatDrawableManager.b;
            }
            drawableMutate.setColorFilter(AppCompatDrawableManager.c(i, mode));
        }

        public final ColorStateList d(Context context, int i) {
            if (i == R.drawable.abc_edit_text_material) {
                return ContextCompat.c(context, R.color.abc_tint_edittext);
            }
            if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                return ContextCompat.c(context, R.color.abc_tint_switch_track);
            }
            if (i == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList colorStateListD = ThemeUtils.d(context, R.attr.colorSwitchThumbNormal);
                if (colorStateListD != null && colorStateListD.isStateful()) {
                    int[] iArr3 = ThemeUtils.b;
                    iArr[0] = iArr3;
                    iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
                    iArr[1] = ThemeUtils.e;
                    iArr2[1] = ThemeUtils.c(context, R.attr.colorControlActivated);
                    iArr[2] = ThemeUtils.f;
                    iArr2[2] = colorStateListD.getDefaultColor();
                } else {
                    iArr[0] = ThemeUtils.b;
                    iArr2[0] = ThemeUtils.b(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = ThemeUtils.e;
                    iArr2[1] = ThemeUtils.c(context, R.attr.colorControlActivated);
                    iArr[2] = ThemeUtils.f;
                    iArr2[2] = ThemeUtils.c(context, R.attr.colorSwitchThumbNormal);
                }
                return new ColorStateList(iArr, iArr2);
            }
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, ThemeUtils.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return b(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return b(context, ThemeUtils.c(context, R.attr.colorAccent));
            }
            if (i != R.drawable.abc_spinner_mtrl_am_alpha && i != R.drawable.abc_spinner_textfield_background_material) {
                if (a(i, this.b)) {
                    return ThemeUtils.d(context, R.attr.colorControlNormal);
                }
                if (a(i, this.e)) {
                    return ContextCompat.c(context, R.color.abc_tint_default);
                }
                if (a(i, this.f)) {
                    return ContextCompat.c(context, R.color.abc_tint_btn_checkable);
                }
                if (i == R.drawable.abc_seekbar_thumb_material) {
                    return ContextCompat.c(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            return ContextCompat.c(context, R.color.abc_tint_spinner);
        }
    }

    public static synchronized AppCompatDrawableManager a() {
        try {
            if (c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return ResourceManagerInternal.f(i, mode);
    }

    public static synchronized void d() {
        if (c == null) {
            AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
            c = appCompatDrawableManager;
            appCompatDrawableManager.a = ResourceManagerInternal.b();
            ResourceManagerInternal resourceManagerInternal = c.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            synchronized (resourceManagerInternal) {
                resourceManagerInternal.e = anonymousClass1;
            }
        }
    }

    public static void e(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        PorterDuff.Mode mode = ResourceManagerInternal.f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = tintInfo.d;
        if (!z && !tintInfo.c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterF = null;
        ColorStateList colorStateList = z ? tintInfo.a : null;
        PorterDuff.Mode mode2 = tintInfo.c ? tintInfo.b : ResourceManagerInternal.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterF = ResourceManagerInternal.f(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterF);
    }
}
