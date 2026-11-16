package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import androidx.collection.LongSparseArrayKt;
import androidx.collection.LruCache;
import androidx.collection.SparseArrayCompat;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.ecffri.arrows.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public final class ResourceManagerInternal {
    public static ResourceManagerInternal g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public ResourceManagerHooks e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final ColorFilterLruCache h = new ColorFilterLruCache(6);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AsldcInflateDelegate implements InflateDelegate {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AvdcInflateDelegate implements InflateDelegate {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ColorFilterLruCache extends LruCache<Integer, PorterDuffColorFilter> {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class DrawableDelegate implements InflateDelegate {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface InflateDelegate {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RestrictTo
    public interface ResourceManagerHooks {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class VdcInflateDelegate implements InflateDelegate {
    }

    public final synchronized void a(Context context, long j, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                LongSparseArray longSparseArray = (LongSparseArray) this.b.get(context);
                if (longSparseArray == null) {
                    longSparseArray = new LongSparseArray();
                    this.b.put(context, longSparseArray);
                }
                longSparseArray.f(j, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Drawable c(Context context, long j) {
        LongSparseArray longSparseArray = (LongSparseArray) this.b.get(context);
        if (longSparseArray == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) longSparseArray.c(j);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iB = ContainerHelpersKt.b(longSparseArray.b, longSparseArray.d, j);
            if (iB >= 0) {
                Object[] objArr = longSparseArray.c;
                Object obj = objArr[iB];
                Object obj2 = LongSparseArrayKt.a;
                if (obj != obj2) {
                    objArr[iB] = obj2;
                    longSparseArray.a = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable d(Context context, int i) {
        return e(context, false, i);
    }

    public final synchronized Drawable e(Context context, boolean z, int i) {
        Drawable drawableC;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableD = d(context, R.drawable.abc_vector_test);
                if (drawableD == null || (!(drawableD instanceof VectorDrawableCompat) && !"android.graphics.drawable.VectorDrawable".equals(drawableD.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            if (this.c == null) {
                this.c = new TypedValue();
            }
            TypedValue typedValue = this.c;
            context.getResources().getValue(i, typedValue, true);
            long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
            drawableC = c(context, j);
            if (drawableC == null) {
                LayerDrawable layerDrawableC = null;
                if (this.e != null) {
                    if (i == R.drawable.abc_cab_background_top_material) {
                        layerDrawableC = new LayerDrawable(new Drawable[]{d(context, R.drawable.abc_cab_background_internal_bg), d(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
                    } else if (i == R.drawable.abc_ratingbar_material) {
                        layerDrawableC = AppCompatDrawableManager.AnonymousClass1.c(this, context, R.dimen.abc_star_big);
                    } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                        layerDrawableC = AppCompatDrawableManager.AnonymousClass1.c(this, context, R.dimen.abc_star_medium);
                    } else if (i == R.drawable.abc_ratingbar_small_material) {
                        layerDrawableC = AppCompatDrawableManager.AnonymousClass1.c(this, context, R.dimen.abc_star_small);
                    }
                }
                drawableC = layerDrawableC;
                if (drawableC != null) {
                    drawableC.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, j, drawableC);
                }
            }
            if (drawableC == null) {
                drawableC = context.getDrawable(i);
            }
            if (drawableC != null) {
                drawableC = h(context, i, z, drawableC);
            }
            if (drawableC != null) {
                DrawableUtils.a(drawableC);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableC;
    }

    public final synchronized ColorStateList g(Context context, int i) {
        ColorStateList colorStateList;
        SparseArrayCompat sparseArrayCompat;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListD = null;
        colorStateList = (weakHashMap == null || (sparseArrayCompat = (SparseArrayCompat) weakHashMap.get(context)) == null) ? null : (ColorStateList) sparseArrayCompat.c(i);
        if (colorStateList == null) {
            ResourceManagerHooks resourceManagerHooks = this.e;
            if (resourceManagerHooks != null) {
                colorStateListD = ((AppCompatDrawableManager.AnonymousClass1) resourceManagerHooks).d(context, i);
            }
            if (colorStateListD != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                SparseArrayCompat sparseArrayCompat2 = (SparseArrayCompat) this.a.get(context);
                if (sparseArrayCompat2 == null) {
                    sparseArrayCompat2 = new SparseArrayCompat();
                    this.a.put(context, sparseArrayCompat2);
                }
                sparseArrayCompat2.a(i, colorStateListD);
            }
            colorStateList = colorStateListD;
        }
        return colorStateList;
    }

    public static synchronized ResourceManagerInternal b() {
        try {
            if (g == null) {
                g = new ResourceManagerInternal();
            }
        } catch (Throwable th) {
            throw th;
        }
        return g;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        ColorFilterLruCache colorFilterLruCache = h;
        colorFilterLruCache.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) colorFilterLruCache.c(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f0 A[RETURN] */
    public final Drawable h(Context context, int i, boolean z, Drawable drawable) {
        int iRound;
        ColorStateList colorStateListG = g(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListG != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListG);
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        ResourceManagerHooks resourceManagerHooks = this.e;
        int i2 = R.attr.colorControlNormal;
        if (resourceManagerHooks != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = ThemeUtils.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = AppCompatDrawableManager.b;
                AppCompatDrawableManager.AnonymousClass1.e(drawableFindDrawableByLayerId, iC, mode2);
                AppCompatDrawableManager.AnonymousClass1.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), ThemeUtils.c(context, R.attr.colorControlNormal), mode2);
                AppCompatDrawableManager.AnonymousClass1.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), ThemeUtils.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = ThemeUtils.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = AppCompatDrawableManager.b;
                AppCompatDrawableManager.AnonymousClass1.e(drawableFindDrawableByLayerId2, iB, mode3);
                AppCompatDrawableManager.AnonymousClass1.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), ThemeUtils.c(context, R.attr.colorControlActivated), mode3);
                AppCompatDrawableManager.AnonymousClass1.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), ThemeUtils.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        if (resourceManagerHooks != null) {
            AppCompatDrawableManager.AnonymousClass1 anonymousClass1 = (AppCompatDrawableManager.AnonymousClass1) resourceManagerHooks;
            PorterDuff.Mode mode4 = AppCompatDrawableManager.b;
            boolean z2 = true;
            if (AppCompatDrawableManager.AnonymousClass1.a(i, anonymousClass1.a)) {
                iRound = -1;
            } else {
                if (AppCompatDrawableManager.AnonymousClass1.a(i, anonymousClass1.c)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean zA = AppCompatDrawableManager.AnonymousClass1.a(i, anonymousClass1.d);
                    i2 = android.R.attr.colorBackground;
                    if (zA) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                    } else if (i != R.drawable.abc_dialog_material_background) {
                        i2 = 0;
                        z2 = false;
                    }
                }
                iRound = -1;
            }
            if (z2) {
                Drawable drawableMutate2 = drawable.mutate();
                drawableMutate2.setColorFilter(AppCompatDrawableManager.c(ThemeUtils.c(context, i2), mode4));
                if (iRound != -1) {
                    drawableMutate2.setAlpha(iRound);
                    return drawable;
                }
            } else if (z) {
                return null;
            }
        } else if (z) {
            return null;
        }
        return drawable;
    }
}
