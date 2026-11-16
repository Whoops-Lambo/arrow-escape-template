package com.google.android.exoplayer2.text.webvtt;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.span.HorizontalTextInVerticalContextSpan;
import com.google.android.exoplayer2.text.span.RubySpan;
import com.google.android.exoplayer2.text.span.SpanUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.ironsource.C4664b4;
import defpackage.e32;
import defpackage.h83;
import defpackage.i83;
import defpackage.j83;
import defpackage.k83;
import defpackage.nj;
import defpackage.q63;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class WebvttCueParser {
    private static final char CHAR_AMPERSAND = '&';
    private static final char CHAR_GREATER_THAN = '>';
    private static final char CHAR_LESS_THAN = '<';
    private static final char CHAR_SEMI_COLON = ';';
    private static final char CHAR_SLASH = '/';
    private static final char CHAR_SPACE = ' ';
    public static final Pattern CUE_HEADER_PATTERN = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern CUE_SETTING_PATTERN = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map<String, Integer> DEFAULT_BACKGROUND_COLORS;
    static final float DEFAULT_POSITION = 0.5f;
    private static final Map<String, Integer> DEFAULT_TEXT_COLORS;
    private static final String ENTITY_AMPERSAND = "amp";
    private static final String ENTITY_GREATER_THAN = "gt";
    private static final String ENTITY_LESS_THAN = "lt";
    private static final String ENTITY_NON_BREAK_SPACE = "nbsp";
    private static final int STYLE_BOLD = 1;
    private static final int STYLE_ITALIC = 2;
    private static final String TAG = "WebvttCueParser";
    private static final String TAG_BOLD = "b";
    private static final String TAG_CLASS = "c";
    private static final String TAG_ITALIC = "i";
    private static final String TAG_LANG = "lang";
    private static final String TAG_RUBY = "ruby";
    private static final String TAG_RUBY_TEXT = "rt";
    private static final String TAG_UNDERLINE = "u";
    private static final String TAG_VOICE = "v";
    private static final int TEXT_ALIGNMENT_CENTER = 2;
    private static final int TEXT_ALIGNMENT_END = 3;
    private static final int TEXT_ALIGNMENT_LEFT = 4;
    private static final int TEXT_ALIGNMENT_RIGHT = 5;
    private static final int TEXT_ALIGNMENT_START = 1;

    private static int firstKnownRubyPosition(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        e32.a();
        return 0;
    }

    static {
        HashMap map = new HashMap();
        q63.p(255, 255, 255, map, "white");
        q63.p(0, 255, 0, map, "lime");
        q63.p(0, 255, 255, map, "cyan");
        q63.p(255, 0, 0, map, "red");
        q63.p(255, 255, 0, map, "yellow");
        q63.p(255, 0, 255, map, "magenta");
        q63.p(0, 0, 255, map, "blue");
        q63.p(0, 0, 0, map, "black");
        DEFAULT_TEXT_COLORS = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        q63.p(255, 255, 255, map2, "bg_white");
        q63.p(0, 255, 0, map2, "bg_lime");
        q63.p(0, 255, 255, map2, "bg_cyan");
        q63.p(255, 0, 0, map2, "bg_red");
        q63.p(255, 255, 0, map2, "bg_yellow");
        q63.p(255, 0, 255, map2, "bg_magenta");
        q63.p(0, 0, 255, map2, "bg_blue");
        q63.p(0, 0, 0, map2, "bg_black");
        DEFAULT_BACKGROUND_COLORS = Collections.unmodifiableMap(map2);
    }

    private static void applySpansForTag(@Nullable String str, i83 i83Var, List<h83> list, SpannableStringBuilder spannableStringBuilder, List<WebvttCssStyle> list2) {
        int i = i83Var.b;
        int length = spannableStringBuilder.length();
        String str2 = i83Var.a;
        str2.getClass();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                nj.t(1, spannableStringBuilder, i, length, 33);
                break;
            case "c":
                applyDefaultColors(spannableStringBuilder, i83Var.d, i, length);
                break;
            case "i":
                nj.t(2, spannableStringBuilder, i, length, 33);
                break;
            case "u":
                nj.x(spannableStringBuilder, i, length, 33);
                break;
            case "ruby":
                applyRubySpans(spannableStringBuilder, str, i83Var, list, list2);
                break;
            default:
                return;
        }
        List<j83> applicableStyles = getApplicableStyles(list2, str, i83Var);
        for (int i2 = 0; i2 < applicableStyles.size(); i2++) {
            applyStyleToText(spannableStringBuilder, applicableStyles.get(i2).b, i, length);
        }
    }

    private static void applyStyleToText(SpannableStringBuilder spannableStringBuilder, WebvttCssStyle webvttCssStyle, int i, int i2) {
        if (webvttCssStyle == null) {
            return;
        }
        if (webvttCssStyle.getStyle() != -1) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new StyleSpan(webvttCssStyle.getStyle()), i, i2, 33);
        }
        if (webvttCssStyle.isLinethrough()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (webvttCssStyle.isUnderline()) {
            nj.x(spannableStringBuilder, i, i2, 33);
        }
        if (webvttCssStyle.hasFontColor()) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new ForegroundColorSpan(webvttCssStyle.getFontColor()), i, i2, 33);
        }
        if (webvttCssStyle.hasBackgroundColor()) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new BackgroundColorSpan(webvttCssStyle.getBackgroundColor()), i, i2, 33);
        }
        if (webvttCssStyle.getFontFamily() != null) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new TypefaceSpan(webvttCssStyle.getFontFamily()), i, i2, 33);
        }
        int fontSizeUnit = webvttCssStyle.getFontSizeUnit();
        if (fontSizeUnit == 1) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new AbsoluteSizeSpan((int) webvttCssStyle.getFontSize(), true), i, i2, 33);
        } else if (fontSizeUnit == 2) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new RelativeSizeSpan(webvttCssStyle.getFontSize()), i, i2, 33);
        } else if (fontSizeUnit == 3) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new RelativeSizeSpan(webvttCssStyle.getFontSize() / 100.0f), i, i2, 33);
        }
        if (webvttCssStyle.getCombineUpright()) {
            spannableStringBuilder.setSpan(new HorizontalTextInVerticalContextSpan(), i, i2, 33);
        }
    }

    private static int findEndOfTag(String str, int i) {
        int iIndexOf = str.indexOf(62, i);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static List<j83> getApplicableStyles(List<WebvttCssStyle> list, @Nullable String str, i83 i83Var) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            WebvttCssStyle webvttCssStyle = list.get(i);
            int specificityScore = webvttCssStyle.getSpecificityScore(str, i83Var.a, i83Var.d, i83Var.c);
            if (specificityScore > 0) {
                arrayList.add(new j83(specificityScore, webvttCssStyle));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static Cue newCueForText(CharSequence charSequence) {
        k83 k83Var = new k83();
        k83Var.c = charSequence;
        return k83Var.a().build();
    }

    @Nullable
    private static WebvttCueInfo parseCue(@Nullable String str, Matcher matcher, ParsableByteArray parsableByteArray, List<WebvttCssStyle> list) {
        k83 k83Var = new k83();
        try {
            k83Var.a = WebvttParserUtil.parseTimestampUs((String) Assertions.checkNotNull(matcher.group(1)));
            k83Var.b = WebvttParserUtil.parseTimestampUs((String) Assertions.checkNotNull(matcher.group(2)));
            parseCueSettingsList((String) Assertions.checkNotNull(matcher.group(3)), k83Var);
            StringBuilder sb = new StringBuilder();
            String line = parsableByteArray.readLine();
            while (!TextUtils.isEmpty(line)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(line.trim());
                line = parsableByteArray.readLine();
            }
            k83Var.c = parseCueText(str, sb.toString(), list);
            return new WebvttCueInfo(k83Var.a().build(), k83Var.a, k83Var.b);
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    private static void parseCueSettingsList(String str, k83 k83Var) {
        Matcher matcher = CUE_SETTING_PATTERN.matcher(str);
        while (matcher.find()) {
            String str2 = (String) Assertions.checkNotNull(matcher.group(1));
            String str3 = (String) Assertions.checkNotNull(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    parseLineAttribute(str3, k83Var);
                } else if ("align".equals(str2)) {
                    k83Var.d = parseTextAlignment(str3);
                } else if (C4664b4.i.L.equals(str2)) {
                    parsePositionAttribute(str3, k83Var);
                } else if ("size".equals(str2)) {
                    k83Var.j = WebvttParserUtil.parsePercentage(str3);
                } else if ("vertical".equals(str2)) {
                    k83Var.k = parseVerticalAttribute(str3);
                } else {
                    Log.w(TAG, "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                Log.w(TAG, "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static SpannedString parseCueText(@Nullable String str, String str2, List<WebvttCssStyle> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String strTrim = "";
            if (i >= str2.length()) {
                break;
            }
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    applyEntity(str2.substring(i, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int iFindEndOfTag = i + 1;
                if (iFindEndOfTag < str2.length()) {
                    boolean z = str2.charAt(iFindEndOfTag) == '/';
                    iFindEndOfTag = findEndOfTag(str2, iFindEndOfTag);
                    int i2 = iFindEndOfTag - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = iFindEndOfTag - 1;
                    }
                    String strSubstring = str2.substring(i3, i2);
                    if (!strSubstring.trim().isEmpty()) {
                        String tagName = getTagName(strSubstring);
                        if (isSupportedTag(tagName)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    i83 i83Var = (i83) arrayDeque.pop();
                                    applySpansForTag(str, i83Var, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new h83(i83Var, spannableStringBuilder.length()));
                                    }
                                    if (i83Var.a.equals(tagName)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                int length = spannableStringBuilder.length();
                                String strTrim2 = strSubstring.trim();
                                Assertions.checkArgument(!strTrim2.isEmpty());
                                int iIndexOf3 = strTrim2.indexOf(" ");
                                if (iIndexOf3 != -1) {
                                    strTrim = strTrim2.substring(iIndexOf3).trim();
                                    strTrim2 = strTrim2.substring(0, iIndexOf3);
                                }
                                String[] strArrSplit = Util.split(strTrim2, "\\.");
                                String str3 = strArrSplit[0];
                                HashSet hashSet = new HashSet();
                                for (int i4 = 1; i4 < strArrSplit.length; i4++) {
                                    hashSet.add(strArrSplit[i4]);
                                }
                                arrayDeque.push(new i83(str3, length, strTrim, hashSet));
                            }
                        }
                    }
                }
                i = iFindEndOfTag;
            }
        }
        while (!arrayDeque.isEmpty()) {
            applySpansForTag(str, (i83) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        applySpansForTag(str, new i83("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static void parseLineAttribute(String str, k83 k83Var) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            k83Var.g = parseLineAnchor(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            k83Var.e = WebvttParserUtil.parsePercentage(str);
            k83Var.f = 0;
        } else {
            k83Var.e = Integer.parseInt(str);
            k83Var.f = 1;
        }
    }

    private static void parsePositionAttribute(String str, k83 k83Var) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            k83Var.i = parsePositionAnchor(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        k83Var.h = WebvttParserUtil.parsePercentage(str);
    }

    private static void applyDefaultColors(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i2) {
        for (String str : set) {
            Map<String, Integer> map = DEFAULT_TEXT_COLORS;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i, i2, 33);
            } else {
                Map<String, Integer> map2 = DEFAULT_BACKGROUND_COLORS;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i, i2, 33);
                }
            }
        }
    }

    private static void applyEntity(String str, SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        switch (str) {
            case "gt":
                spannableStringBuilder.append(CHAR_GREATER_THAN);
                break;
            case "lt":
                spannableStringBuilder.append(CHAR_LESS_THAN);
                break;
            case "amp":
                spannableStringBuilder.append(CHAR_AMPERSAND);
                break;
            case "nbsp":
                spannableStringBuilder.append(CHAR_SPACE);
                break;
            default:
                Log.w(TAG, "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    private static void applyRubySpans(SpannableStringBuilder spannableStringBuilder, @Nullable String str, i83 i83Var, List<h83> list, List<WebvttCssStyle> list2) {
        int rubyPosition = getRubyPosition(list2, str, i83Var);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, h83.c);
        int i = i83Var.b;
        int length = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if ("rt".equals(((h83) arrayList.get(i2)).a.a)) {
                h83 h83Var = (h83) arrayList.get(i2);
                int iFirstKnownRubyPosition = firstKnownRubyPosition(getRubyPosition(list2, str, h83Var.a), rubyPosition, 1);
                int i3 = h83Var.a.b - length;
                int i4 = h83Var.b - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i3, i4);
                spannableStringBuilder.delete(i3, i4);
                spannableStringBuilder.setSpan(new RubySpan(charSequenceSubSequence.toString(), iFirstKnownRubyPosition), i, i3, 33);
                length = charSequenceSubSequence.length() + length;
                i = i3;
            }
        }
    }

    private static int getRubyPosition(List<WebvttCssStyle> list, @Nullable String str, i83 i83Var) {
        List<j83> applicableStyles = getApplicableStyles(list, str, i83Var);
        for (int i = 0; i < applicableStyles.size(); i++) {
            WebvttCssStyle webvttCssStyle = applicableStyles.get(i).b;
            if (webvttCssStyle.getRubyPosition() != -1) {
                return webvttCssStyle.getRubyPosition();
            }
        }
        return -1;
    }

    private static String getTagName(String str) {
        String strTrim = str.trim();
        Assertions.checkArgument(!strTrim.isEmpty());
        return Util.splitAtFirst(strTrim, "[ \\.]")[0];
    }

    private static boolean isSupportedTag(String str) {
        str.getClass();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    private static int parseLineAnchor(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                Log.w(TAG, "Invalid anchor value: ".concat(str));
                return Integer.MIN_VALUE;
        }
    }

    private static int parsePositionAnchor(String str) {
        str.getClass();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                Log.w(TAG, "Invalid anchor value: ".concat(str));
                return Integer.MIN_VALUE;
        }
    }

    private static int parseTextAlignment(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                Log.w(TAG, "Invalid alignment value: ".concat(str));
                return 2;
        }
    }

    private static int parseVerticalAttribute(String str) {
        str.getClass();
        if (!str.equals("lr")) {
            if (!str.equals("rl")) {
                Log.w(TAG, "Invalid 'vertical' value: ".concat(str));
                return Integer.MIN_VALUE;
            }
            return 1;
        }
        return 2;
    }

    @Nullable
    public static WebvttCueInfo parseCue(ParsableByteArray parsableByteArray, List<WebvttCssStyle> list) {
        String line = parsableByteArray.readLine();
        if (line == null) {
            return null;
        }
        Pattern pattern = CUE_HEADER_PATTERN;
        Matcher matcher = pattern.matcher(line);
        if (matcher.matches()) {
            return parseCue(null, matcher, parsableByteArray, list);
        }
        String line2 = parsableByteArray.readLine();
        if (line2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(line2);
        if (matcher2.matches()) {
            return parseCue(line.trim(), matcher2, parsableByteArray, list);
        }
        return null;
    }

    public static Cue.Builder parseCueSettingsList(String str) {
        k83 k83Var = new k83();
        parseCueSettingsList(str, k83Var);
        return k83Var.a();
    }
}
