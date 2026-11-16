package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.text.TextUtils;
import com.ironsource.C4664b4;
import defpackage.e32;
import defpackage.jc1;
import defpackage.rl3;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class ColorParser {
    private static final Map<String, Integer> COLOR_MAP;
    private static final String RGB = "rgb";
    private static final String RGBA = "rgba";
    private static final Pattern RGB_PATTERN = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern RGBA_PATTERN_INT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern RGBA_PATTERN_FLOAT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    public static int parseCssColor(String str) {
        return parseColorInternal(str, true);
    }

    public static int parseTtmlColor(String str) {
        return parseColorInternal(str, false);
    }

    static {
        HashMap map = new HashMap();
        COLOR_MAP = map;
        jc1.u(-984833, map, "aliceblue", -332841, "antiquewhite");
        rl3.r(map, "aqua", -16711681, -8388652, "aquamarine");
        jc1.u(-983041, map, "azure", -657956, "beige");
        jc1.u(-6972, map, "bisque", -16777216, "black");
        jc1.u(-5171, map, "blanchedalmond", -16776961, "blue");
        jc1.u(-7722014, map, "blueviolet", -5952982, "brown");
        jc1.u(-2180985, map, "burlywood", -10510688, "cadetblue");
        jc1.u(-8388864, map, "chartreuse", -2987746, "chocolate");
        jc1.u(-32944, map, "coral", -10185235, "cornflowerblue");
        jc1.u(-1828, map, "cornsilk", -2354116, "crimson");
        rl3.r(map, "cyan", -16711681, -16777077, "darkblue");
        jc1.u(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        rl3.r(map, "darkgray", -5658199, -16751616, "darkgreen");
        rl3.r(map, "darkgrey", -5658199, -4343957, "darkkhaki");
        jc1.u(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        jc1.u(-29696, map, "darkorange", -6737204, "darkorchid");
        jc1.u(-7667712, map, "darkred", -1468806, "darksalmon");
        jc1.u(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        rl3.r(map, "darkturquoise", -16724271, -7077677, "darkviolet");
        jc1.u(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        rl3.r(map, "dodgerblue", -14774017, -5103070, "firebrick");
        jc1.u(-1296, map, "floralwhite", -14513374, "forestgreen");
        rl3.r(map, "fuchsia", -65281, -2302756, "gainsboro");
        jc1.u(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        jc1.u(-16744448, map, "green", -5374161, "greenyellow");
        rl3.r(map, "grey", -8355712, -983056, "honeydew");
        jc1.u(-38476, map, "hotpink", -3318692, "indianred");
        jc1.u(-11861886, map, "indigo", -16, "ivory");
        jc1.u(-989556, map, "khaki", -1644806, "lavender");
        jc1.u(-3851, map, "lavenderblush", -8586240, "lawngreen");
        jc1.u(-1331, map, "lemonchiffon", -5383962, "lightblue");
        jc1.u(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        jc1.u(-18751, map, "lightpink", -24454, "lightsalmon");
        jc1.u(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        rl3.r(map, "lightsteelblue", -5192482, -32, "lightyellow");
        jc1.u(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        jc1.u(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        jc1.u(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        jc1.u(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        jc1.u(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        jc1.u(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        jc1.u(-15132304, map, "midnightblue", -655366, "mintcream");
        jc1.u(-6943, map, "mistyrose", -6987, "moccasin");
        jc1.u(-8531, map, "navajowhite", -16777088, "navy");
        jc1.u(-133658, map, "oldlace", -8355840, "olive");
        jc1.u(-9728477, map, "olivedrab", -23296, "orange");
        jc1.u(-47872, map, "orangered", -2461482, "orchid");
        jc1.u(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        jc1.u(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        jc1.u(-4139, map, "papayawhip", -9543, "peachpuff");
        jc1.u(-3308225, map, "peru", -16181, "pink");
        jc1.u(-2252579, map, "plum", -5185306, "powderblue");
        jc1.u(-8388480, map, "purple", -10079335, "rebeccapurple");
        jc1.u(-65536, map, "red", -4419697, "rosybrown");
        jc1.u(-12490271, map, "royalblue", -7650029, "saddlebrown");
        jc1.u(-360334, map, "salmon", -744352, "sandybrown");
        jc1.u(-13726889, map, "seagreen", -2578, "seashell");
        jc1.u(-6270419, map, "sienna", -4144960, "silver");
        jc1.u(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        rl3.r(map, "snow", -1286, -16711809, "springgreen");
        jc1.u(-12156236, map, "steelblue", -2968436, "tan");
        jc1.u(-16744320, map, "teal", -2572328, "thistle");
        jc1.u(-40121, map, "tomato", 0, C4664b4.i.T);
        jc1.u(-12525360, map, "turquoise", -1146130, "violet");
        jc1.u(-663885, map, "wheat", -1, "white");
        jc1.u(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    private static int argb(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    private static int rgb(int i, int i2, int i3) {
        return argb(255, i, i2, i3);
    }

    private ColorParser() {
    }

    private static int parseColorInternal(String str, boolean z) {
        Pattern pattern;
        int i;
        Assertions.checkArgument(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i2 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i2;
            }
            if (strReplace.length() == 9) {
                return ((i2 & 255) << 24) | (i2 >>> 8);
            }
            e32.a();
            return 0;
        }
        if (strReplace.startsWith(RGBA)) {
            if (z) {
                pattern = RGBA_PATTERN_FLOAT_ALPHA;
            } else {
                pattern = RGBA_PATTERN_INT_ALPHA;
            }
            Matcher matcher = pattern.matcher(strReplace);
            if (matcher.matches()) {
                if (z) {
                    i = (int) (Float.parseFloat(matcher.group(4)) * 255.0f);
                } else {
                    i = Integer.parseInt(matcher.group(4), 10);
                }
                return argb(i, Integer.parseInt(matcher.group(1), 10), Integer.parseInt(matcher.group(2), 10), Integer.parseInt(matcher.group(3), 10));
            }
        } else if (strReplace.startsWith(RGB)) {
            Matcher matcher2 = RGB_PATTERN.matcher(strReplace);
            if (matcher2.matches()) {
                return rgb(Integer.parseInt(matcher2.group(1), 10), Integer.parseInt(matcher2.group(2), 10), Integer.parseInt(matcher2.group(3), 10));
            }
        } else {
            Integer num = COLOR_MAP.get(Util.toLowerInvariant(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        e32.a();
        return 0;
    }
}
