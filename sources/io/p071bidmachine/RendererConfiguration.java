package io.p071bidmachine;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.p071bidmachine.util.p;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lio/bidmachine/RendererConfiguration;", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "", "(Ljava/util/Map;)V", "getExtras", "()Ljava/util/Map;", "getWatermark", "getWatermarkDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "Companion", "bidmachine-android-sdk_ba_3_8_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RendererConfiguration {

    @NotNull
    private static final String GOOGLE_WATERMARK = "google_watermark";

    @NotNull
    private final Map<String, Object> extras;

    @NotNull
    public final Map<String, Object> getExtras() {
        return this.extras;
    }

    @Nullable
    public final String getWatermark() {
        Object obj = this.extras.get(GOOGLE_WATERMARK);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public RendererConfiguration(@NotNull Map<String, ? extends Object> map) {
        map.getClass();
        this.extras = map;
    }

    @Nullable
    public final Drawable getWatermarkDrawable(@NotNull Context context) {
        byte[] bArrI;
        Bitmap bitmapDecodeByteArray;
        context.getClass();
        String watermark = getWatermark();
        if (watermark != null) {
            try {
                if (watermark.length() == 0) {
                    watermark = null;
                }
                if (watermark != null && (bArrI = p.i(0, watermark)) != null) {
                    try {
                        bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrI, 0, bArrI.length, null);
                    } catch (Throwable unused) {
                        bitmapDecodeByteArray = null;
                    }
                    if (bitmapDecodeByteArray != null) {
                        Resources resources = context.getResources();
                        resources.getClass();
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmapDecodeByteArray);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        return bitmapDrawable;
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        return null;
    }
}
