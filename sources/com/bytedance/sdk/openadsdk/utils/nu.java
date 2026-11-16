package com.bytedance.sdk.openadsdk.utils;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.Pair;
import com.unity3d.services.UnityAdsConstants;
import defpackage.q63;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class nu {
    private static final Map<String, Pair<? extends Drawable, Integer>> kgy = new HashMap();
    private static Integer ahm = null;

    private static Drawable kgy(String str, Context context, boolean z) {
        Drawable layerDrawable;
        Drawable drawableKgy;
        str.getClass();
        switch (str) {
            case "tt_leftbackicon_selector_for_dark":
                drawableKgy = kgy(com.bytedance.sdk.component.utils.ay.rz(context, "tt_lefterbackicon_titlebar_press_for_dark"), com.bytedance.sdk.component.utils.ay.rz(context, "tt_lefterbackicon_titlebar_for_dark"));
                break;
            case "tt_dislike_dialog_bg":
                drawableKgy = kgy(0, -1, new int[]{gbb.ahm(context, 8.0f)}, null, null, null);
                break;
            case "tt_leftbackbutton_titlebar_photo_preview":
                drawableKgy = kgy(com.bytedance.sdk.component.utils.ay.rz(context, "tt_white_lefterbackicon_titlebar_press"), com.bytedance.sdk.component.utils.ay.rz(context, "tt_white_lefterbackicon_titlebar"));
                break;
            case "tt_seek_progress":
                layerDrawable = new LayerDrawable(new Drawable[]{kgy(0, Integer.valueOf(Color.parseColor("#A5FFFFFF")), new int[]{gbb.ahm(context, 1.5f)}, new int[]{-1, gbb.ahm(context, 1.0f)}, null, null), new ClipDrawable(kgy(0, -1, new int[]{gbb.ahm(context, 1.5f)}, new int[]{-1, gbb.ahm(context, 1.0f)}, null, null), 8388611, 1), new ClipDrawable(kgy(0, Integer.valueOf(Color.parseColor("#fff85959")), new int[]{gbb.ahm(context, 1.5f)}, new int[]{-1, gbb.ahm(context, 1.0f)}, null, null), 8388611, 1)});
                drawableKgy = layerDrawable;
                break;
            case "tt_dislike_middle_seletor":
                drawableKgy = kgy(kgy(0, Integer.valueOf(Color.parseColor("#FDE6E6E6")), null, null, null, null), kgy(0, Integer.valueOf(Color.parseColor("#fdffffff")), null, null, null, null));
                break;
            case "tt_ad_cover_btn_begin_bg":
                drawableKgy = kgy(kgy(0, Integer.valueOf(Color.parseColor("#2a90d7")), new int[]{gbb.ahm(context, 6.0f)}, null, Integer.valueOf(gbb.ahm(context, 1.0f)), Integer.valueOf(Color.parseColor("#7f2a90d7"))), kgy(0, Integer.valueOf(Color.parseColor("#2a90d7")), new int[]{gbb.ahm(context, 6.0f)}, null, Integer.valueOf(gbb.ahm(context, 1.0f)), Integer.valueOf(Color.parseColor("#2a90d7"))));
                break;
            case "tt_leftbackicon_selector":
                drawableKgy = com.bytedance.sdk.component.utils.ay.rz(context, "tt_lefterbackicon_titlebar");
                break;
            case "tt_seek_thumb_normal":
                drawableKgy = kgy(1, -1, null, new int[]{gbb.ahm(context, 15.0f), gbb.ahm(context, 15.0f)}, Integer.valueOf(gbb.ahm(context, 1.0f)), 0);
                break;
            case "tt_stop_movebar_textpage":
                drawableKgy = kgy(com.bytedance.sdk.component.utils.ay.rz(context, "tt_new_pause_video_press"), com.bytedance.sdk.component.utils.ay.rz(context, "tt_new_pause_video"));
                break;
            case "tt_backup_btn_1":
                drawableKgy = kgy(kgy(0, Integer.valueOf(Color.parseColor("#33f32830")), new int[]{gbb.ahm(context, 4.0f)}, null, null, null), kgy(0, Integer.valueOf(Color.parseColor("#f32830")), new int[]{gbb.ahm(context, 4.0f)}, null, null, null));
                break;
            case "tt_ad_report_info_bg":
                drawableKgy = kgy(0, -1, new int[]{gbb.ahm(context, 12.0f), gbb.ahm(context, 12.0f), 0, 0}, null, null, null);
                break;
            case "tt_playable_btn_bk":
                drawableKgy = kgy(0, Integer.valueOf(Color.parseColor("#00000000")), new int[]{gbb.ahm(context, 30.0f)}, null, Integer.valueOf(gbb.ahm(context, 1.0f)), -1);
                break;
            case "tt_dislike_bottom_seletor":
                drawableKgy = kgy(kgy(0, Integer.valueOf(Color.parseColor("#FDE6E6E6")), new int[]{0, 0, gbb.ahm(context, 5.0f), gbb.ahm(context, 5.0f)}, null, null, null), kgy(0, Integer.valueOf(Color.parseColor("#fdffffff")), new int[]{0, 0, gbb.ahm(context, 5.0f), gbb.ahm(context, 5.0f)}, null, null, null));
                break;
            case "tt_seek_thumb_fullscreen":
                drawableKgy = kgy(1, -1, null, new int[]{gbb.ahm(context, 18.0f), gbb.ahm(context, 18.0f)}, null, null);
                break;
            case "tt_custom_dialog_bg":
                drawableKgy = kgy(0, -1, new int[]{gbb.ahm(context, 6.0f)}, null, Integer.valueOf(gbb.ahm(context, 0.8f)), -1);
                break;
            case "tt_ad_loading_three_mid":
                drawableKgy = kgy(0, null, null, null, Integer.valueOf(gbb.ahm(context, 1.5f)), -1);
                break;
            case "tt_custom_dialog_bg_new":
                drawableKgy = kgy(0, -1, new int[]{gbb.ahm(context, 16.0f)}, null, Integer.valueOf(gbb.ahm(context, 0.8f)), -1);
                break;
            case "tt_close_move_detail":
                drawableKgy = kgy(com.bytedance.sdk.component.utils.ay.rz(context, "tt_close_move_details_pressed"), com.bytedance.sdk.component.utils.ay.rz(context, "tt_close_move_details_normal"));
                break;
            case "tt_mute_btn_bg":
                drawableKgy = kgy(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{gbb.ahm(context, 28.0f), gbb.ahm(context, 28.0f)}, null, null);
                break;
            case "tt_seek_thumb":
                drawableKgy = kgy(kgy(1, -1, null, new int[]{gbb.ahm(context, 22.0f), gbb.ahm(context, 22.0f)}, Integer.valueOf(gbb.ahm(context, 1.0f)), 0), kgy(1, -1, null, new int[]{gbb.ahm(context, 15.0f), gbb.ahm(context, 15.0f)}, Integer.valueOf(gbb.ahm(context, 1.0f)), 0));
                break;
            case "tt_reward_countdown_bg":
                drawableKgy = kgy(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{gbb.ahm(context, 28.0f), gbb.ahm(context, 28.0f)}, null, null);
                break;
            case "tt_play_movebar_textpage":
                drawableKgy = kgy(com.bytedance.sdk.component.utils.ay.rz(context, "tt_new_play_video"), com.bytedance.sdk.component.utils.ay.rz(context, "tt_new_play_video"));
                break;
            case "tt_refreshing_video_textpage":
                drawableKgy = kgy(com.bytedance.sdk.component.utils.ay.rz(context, "tt_refreshing_video_textpage_pressed"), com.bytedance.sdk.component.utils.ay.rz(context, "tt_refreshing_video_textpage_normal"));
                break;
            case "tt_playable_progress_style":
                layerDrawable = new LayerDrawable(new Drawable[]{kgy(0, Integer.valueOf(Color.parseColor("#4DFC625C")), new int[]{gbb.ahm(context, 3.0f)}, null, null, null), new ClipDrawable(kgy(0, Integer.valueOf(Color.parseColor("#FC625C")), new int[]{gbb.ahm(context, 3.0f)}, null, null, null), 8388611, 1)});
                drawableKgy = layerDrawable;
                break;
            case "tt_seek_thumb_fullscreen_selector":
                drawableKgy = kgy(kgy(1, -1, null, new int[]{gbb.ahm(context, 18.0f), gbb.ahm(context, 18.0f)}, Integer.valueOf(gbb.ahm(context, 1.0f)), 0), kgy(1, -1, null, new int[]{gbb.ahm(context, 18.0f), gbb.ahm(context, 18.0f)}, Integer.valueOf(gbb.ahm(context, 1.0f)), 0));
                break;
            case "tt_ad_landing_loading_three_mid":
                drawableKgy = kgy(0, null, null, null, Integer.valueOf(gbb.ahm(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case "tt_pangle_ad_mute_btn_bg":
                drawableKgy = kgy(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{gbb.ahm(context, 28.0f), gbb.ahm(context, 28.0f)}, null, null);
                break;
            case "tt_video_black_desc_gradient":
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setGradientType(0);
                gradientDrawable.setColors(new int[]{Color.parseColor("#FF1A1A1A"), Color.parseColor("#00000000")});
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                drawableKgy = gradientDrawable;
                break;
            case "tt_ad_loading_three_left":
                drawableKgy = kgy(0, null, new int[]{gbb.ahm(context, 6.0f), 0, 0, gbb.ahm(context, 6.0f)}, null, Integer.valueOf(gbb.ahm(context, 1.5f)), -1);
                break;
            case "tt_mute_wrapper":
                Drawable drawableRz = com.bytedance.sdk.component.utils.ay.rz(context, "tt_mute");
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[0], drawableRz);
                stateListDrawable.setAutoMirrored(true);
                layerDrawable = stateListDrawable;
                drawableKgy = layerDrawable;
                break;
            case "tt_dislike_top_bg":
                drawableKgy = kgy(0, Integer.valueOf(Color.parseColor("#fdffffff")), new int[]{gbb.ahm(context, 5.0f), gbb.ahm(context, 5.0f), 0, 0}, null, null, null);
                break;
            case "tt_comment_tv":
                drawableKgy = kgy(0, -1, new int[]{gbb.ahm(context, 4.0f)}, null, Integer.valueOf(gbb.ahm(context, 1.0f)), Integer.valueOf(Color.parseColor("#0F161823")));
                break;
            case "tt_reward_full_new_bar_bg":
                drawableKgy = kgy(0, Integer.valueOf(Color.parseColor("#ccffffff")), new int[]{gbb.ahm(context, 18.0f)}, null, null, null);
                break;
            case "tt_reward_full_video_backup_btn_bg":
                drawableKgy = kgy(0, Integer.valueOf(Color.parseColor("#ff0088ff")), new int[]{gbb.ahm(context, 6.0f)}, null, null, null);
                break;
            case "tt_full_reward_loading_progress_style":
                GradientDrawable gradientDrawableKgy = kgy(0, Integer.valueOf(Color.parseColor("#EAEAEA")), new int[]{gbb.ahm(context, 50.0f)}, null, null, null);
                GradientDrawable gradientDrawableB = q63.b(0);
                gradientDrawableB.setCornerRadius(gbb.ahm(context, 15.0f));
                gradientDrawableB.setColors(new int[]{Color.parseColor("#1A73E8"), Color.parseColor("#569FFF")});
                gradientDrawableB.setGradientType(0);
                gradientDrawableB.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
                drawableKgy = new LayerDrawable(new Drawable[]{gradientDrawableKgy, new ScaleDrawable(gradientDrawableB, 8388611, 1.0f, -1.0f)});
                break;
            case "tt_detail_video_btn_bg":
                drawableKgy = kgy(0, Integer.valueOf(Color.parseColor("#26000000")), new int[]{gbb.ahm(context, 4.0f)}, null, null, null);
                break;
            case "tt_pangle_banner_btn_bg":
                drawableKgy = kgy(0, Integer.valueOf(Color.parseColor("#ff2f87f8")), new int[]{gbb.ahm(context, 2.0f)}, new int[]{gbb.ahm(context, 98.0f), gbb.ahm(context, 25.0f)}, null, null);
                break;
            case "tt_seek_thumb_fullscreen_press":
                drawableKgy = kgy(1, -1, null, new int[]{gbb.ahm(context, 18.0f), gbb.ahm(context, 18.0f)}, Integer.valueOf(gbb.ahm(context, 1.0f)), 0);
                break;
            case "tt_browser_download_selector":
                drawableKgy = kgy(kgy(0, Integer.valueOf(Color.parseColor("#2582c3")), null, null, null, null), kgy(0, Integer.valueOf(Color.parseColor("#2a90d7")), null, null, null, null));
                break;
            case "tt_ad_loading_three_right":
                drawableKgy = kgy(0, null, new int[]{0, gbb.ahm(context, 6.0f), gbb.ahm(context, 6.0f), 0}, null, Integer.valueOf(gbb.ahm(context, 1.5f)), -1);
                break;
            case "tt_pangle_btn_bg":
                GradientDrawable gradientDrawableB2 = q63.b(0);
                gradientDrawableB2.setSize(gbb.ahm(context, 280.0f), gbb.ahm(context, 38.0f));
                gradientDrawableB2.setCornerRadius(gbb.ahm(context, 19.0f));
                gradientDrawableB2.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                gradientDrawableB2.setColors(new int[]{Color.parseColor("#fff02d42"), Color.parseColor("#fffc4b3c")});
                gradientDrawableB2.setGradientType(0);
                gradientDrawableB2.setUseLevel(true);
                layerDrawable = gradientDrawableB2;
                drawableKgy = layerDrawable;
                break;
            case "tt_privacy_progress_style":
                drawableKgy = new LayerDrawable(new Drawable[]{kgy(0, Integer.valueOf(Color.parseColor("#33007AFF")), null, null, null, null), new ClipDrawable(kgy(0, Integer.valueOf(Color.parseColor("#007AFF")), null, null, null, null), 8388611, 1)});
                break;
            case "tt_privacy_btn_bg":
                GradientDrawable gradientDrawableB3 = q63.b(0);
                gradientDrawableB3.setSize(gbb.ahm(context, 258.0f), gbb.ahm(context, 43.0f));
                gradientDrawableB3.setCornerRadius(gbb.ahm(context, 22.0f));
                gradientDrawableB3.setColors(new int[]{Color.parseColor("#73CBFC"), Color.parseColor("#3F9CF7")});
                gradientDrawableB3.setGradientType(0);
                layerDrawable = gradientDrawableB3;
                drawableKgy = layerDrawable;
                break;
            case "tt_seek_thumb_press":
                drawableKgy = kgy(1, -1, null, new int[]{gbb.ahm(context, 22.0f), gbb.ahm(context, 22.0f)}, Integer.valueOf(gbb.ahm(context, 1.0f)), 0);
                break;
            case "tt_unmute_wrapper":
                Drawable drawableRz2 = com.bytedance.sdk.component.utils.ay.rz(context, "tt_unmute");
                StateListDrawable stateListDrawable2 = new StateListDrawable();
                stateListDrawable2.addState(new int[0], drawableRz2);
                stateListDrawable2.setAutoMirrored(true);
                layerDrawable = stateListDrawable2;
                drawableKgy = layerDrawable;
                break;
            case "tt_titlebar_close_seletor_for_dark":
                drawableKgy = kgy(com.bytedance.sdk.component.utils.ay.rz(context, "tt_titlebar_close_press_for_dark"), com.bytedance.sdk.component.utils.ay.rz(context, "tt_titlebar_close_for_dark"));
                break;
            case "tt_ad_landing_loading_three_right":
                drawableKgy = kgy(0, null, new int[]{0, gbb.ahm(context, 6.0f), gbb.ahm(context, 6.0f), 0}, null, Integer.valueOf(gbb.ahm(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case "tt_landingpage_loading_text_rect":
                drawableKgy = kgy(0, Integer.valueOf(Color.parseColor("#141A73E8")), new int[]{gbb.ahm(context, 5.0f)}, null, null, null);
                break;
            case "tt_shadow_btn_back_withoutnight":
                Drawable drawableRz3 = com.bytedance.sdk.component.utils.ay.rz(context, "tt_shadow_lefterback_titlebar_press_withoutnight");
                StateListDrawable stateListDrawableKgy = kgy(drawableRz3, com.bytedance.sdk.component.utils.ay.rz(context, "tt_shadow_lefterback_titlebar_withoutnight"));
                stateListDrawableKgy.addState(new int[]{-16842910}, drawableRz3);
                drawableKgy = stateListDrawableKgy;
                break;
            case "tt_circle_solid_mian":
                drawableKgy = kgy(1, Integer.valueOf(Color.parseColor("#e0e0e0")), null, null, null, null);
                break;
            case "tt_browser_progress_style":
                drawableKgy = new LayerDrawable(new Drawable[]{kgy(0, -1, new int[]{0}, null, null, null), new ClipDrawable(kgy(0, Integer.valueOf(Color.parseColor("#1A73E8")), new int[]{0}, null, null, null), 3, 1)});
                break;
            case "tt_download_corner_bg":
                drawableKgy = kgy(0, Integer.valueOf(Color.parseColor("#4A90E2")), new int[]{gbb.ahm(context, 4.0f)}, null, null, null);
                break;
            case "tt_ad_report_info_button_bg":
                drawableKgy = kgy(kgy(0, Integer.valueOf(Color.parseColor("#0D000000")), new int[]{gbb.ahm(context, 2.0f)}, null, Integer.valueOf(gbb.ahm(context, 1.0f)), Integer.valueOf(Color.parseColor("#1F000000"))), kgy(0, -1, new int[]{gbb.ahm(context, 2.0f)}, null, Integer.valueOf(gbb.ahm(context, 1.0f)), Integer.valueOf(Color.parseColor("#1618231F"))));
                break;
            case "tt_ad_landing_loading_three_left":
                drawableKgy = kgy(0, null, new int[]{gbb.ahm(context, 6.0f), 0, 0, gbb.ahm(context, 6.0f)}, null, Integer.valueOf(gbb.ahm(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case "tt_pangle_ad_close_btn_bg":
                drawableKgy = kgy(1, Integer.valueOf(Color.parseColor("#30333333")), null, new int[]{gbb.ahm(context, 28.0f), gbb.ahm(context, 28.0f)}, null, null);
                break;
            case "tt_lefterbackicon_titlebar_press_wrapper":
                Drawable drawableRz4 = com.bytedance.sdk.component.utils.ay.rz(context, "tt_lefterbackicon_titlebar_press");
                StateListDrawable stateListDrawable3 = new StateListDrawable();
                stateListDrawable3.addState(new int[0], drawableRz4);
                stateListDrawable3.setAutoMirrored(true);
                layerDrawable = stateListDrawable3;
                drawableKgy = layerDrawable;
                break;
            case "tt_reward_video_download_btn_bg":
                drawableKgy = kgy(0, Integer.valueOf(Color.parseColor("#ff007aff")), new int[]{gbb.ahm(context, 18.0f)}, null, null, null);
                break;
            case "tt_ad_loading_rect":
                drawableKgy = kgy(0, Integer.valueOf(Color.parseColor("#33FFFFFF")), new int[]{gbb.ahm(context, 15.0f)}, null, null, null);
                break;
            case "tt_shadow_btn_back":
                Drawable drawableRz5 = com.bytedance.sdk.component.utils.ay.rz(context, "tt_shadow_lefterback_titlebar_press");
                StateListDrawable stateListDrawableKgy2 = kgy(drawableRz5, com.bytedance.sdk.component.utils.ay.rz(context, "tt_shadow_lefterback_titlebar"));
                stateListDrawableKgy2.addState(new int[]{-16842910}, drawableRz5);
                drawableKgy = stateListDrawableKgy2;
                break;
            case "tt_dislike_top_seletor":
                drawableKgy = kgy(kgy(0, Integer.valueOf(Color.parseColor("#FDE6E6E6")), new int[]{gbb.ahm(context, 5.0f), gbb.ahm(context, 5.0f), 0, 0}, null, null, null), kgy(0, Integer.valueOf(Color.parseColor("#fdffffff")), new int[]{gbb.ahm(context, 5.0f), gbb.ahm(context, 5.0f), 0, 0}, null, null, null));
                break;
            case "tt_video_loading_progress_bar":
                RotateDrawable rotateDrawable = new RotateDrawable();
                rotateDrawable.setDrawable(com.bytedance.sdk.component.utils.ay.rz(context, "tt_normalscreen_loading"));
                rotateDrawable.setFromDegrees(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                rotateDrawable.setToDegrees(360.0f);
                rotateDrawable.setPivotX(0.5f);
                rotateDrawable.setPivotY(0.5f);
                layerDrawable = rotateDrawable;
                drawableKgy = layerDrawable;
                break;
            case "tt_ad_skip_btn_bg2":
                drawableKgy = kgy(0, Integer.valueOf(Color.parseColor("#66161823")), new int[]{gbb.ahm(context, 14.0f)}, null, null, null);
                break;
            case "tt_privacy_webview_bg":
                drawableKgy = kgy(0, -1, new int[]{gbb.ahm(context, 14.5f)}, null, null, null);
                break;
            case "tt_titlebar_close_seletor":
                drawableKgy = com.bytedance.sdk.component.utils.ay.rz(context, "tt_titlebar_close_drawable");
                break;
            default:
                drawableKgy = null;
                break;
        }
        if (z) {
            kgy.put(str, new Pair<>(drawableKgy, 1));
        }
        return drawableKgy;
    }

    public static Drawable kgy(Context context, String str) {
        return kgy(context, str, true);
    }

    public static Drawable kgy(Context context, String str, boolean z) {
        Pair<? extends Drawable, Integer> pair;
        ahm = Integer.valueOf(com.bytedance.sdk.openadsdk.core.xh.uq().nu());
        "drawable name is: ".concat(String.valueOf(str));
        Map<String, Pair<? extends Drawable, Integer>> map = kgy;
        map.size();
        if (map.containsKey(str) && (pair = map.get(str)) != null) {
            Drawable drawable = (Drawable) pair.first;
            map.put(str, new Pair<>(drawable, Integer.valueOf(((Integer) pair.second).intValue() + 1)));
            return drawable;
        }
        kgy();
        return kgy(str, context, z);
    }

    private static GradientDrawable kgy(int i, Integer num, int[] iArr, int[] iArr2, Integer num2, Integer num3) {
        GradientDrawable gradientDrawableB = q63.b(i);
        if (num != null) {
            gradientDrawableB.setColor(num.intValue());
        }
        int length = iArr != null ? iArr.length : 0;
        if (length == 1) {
            gradientDrawableB.setCornerRadius(iArr[0]);
        } else if (length == 4) {
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            gradientDrawableB.setCornerRadii(new float[]{i2, i2, i3, i3, i4, i4, i5, i5});
        }
        if (iArr2 != null && iArr2.length == 2) {
            gradientDrawableB.setSize(iArr2[0], iArr2[1]);
        }
        if (num2 != null && num3 != null) {
            gradientDrawableB.setStroke(num2.intValue(), num3.intValue());
        }
        return gradientDrawableB;
    }

    private static void kgy() {
        Map<String, Pair<? extends Drawable, Integer>> map = kgy;
        if (map.size() < ahm.intValue()) {
            return;
        }
        String key = null;
        int iIntValue = Integer.MAX_VALUE;
        for (Map.Entry<String, Pair<? extends Drawable, Integer>> entry : map.entrySet()) {
            if (((Integer) entry.getValue().second).intValue() < iIntValue) {
                key = entry.getKey();
                iIntValue = ((Integer) entry.getValue().second).intValue();
                if (iIntValue == 1) {
                    break;
                }
            }
        }
        kgy.remove(key);
    }

    private static StateListDrawable kgy(Drawable drawable, Drawable drawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (drawable != null) {
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable);
        }
        if (drawable2 != null) {
            stateListDrawable.addState(new int[0], drawable2);
        }
        return stateListDrawable;
    }

    public static Drawable kgy(Context context, int i) {
        return kgy(context, Color.parseColor("#1A73E8"), i);
    }

    public static Drawable kgy(Context context, int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(gbb.ahm(context, i2));
        return gradientDrawable;
    }
}
