package io.p071bidmachine.iab.mraid;

import com.tiktok.appevents.contents.TTContentsEventConstants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class n0 {
    public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ", Locale.US);
    public static final String[] b = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};

    public static o a(String str) throws JSONException, ParseException {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString(TTContentsEventConstants.Params.EVENT_PROPERTY_DESCRIPTION);
        Objects.requireNonNull(string);
        String string2 = jSONObject.getString("start");
        SimpleDateFormat simpleDateFormat = a;
        Date date = simpleDateFormat.parse(string2);
        Objects.requireNonNull(date);
        o oVar = new o(string, date);
        if (jSONObject.has("location")) {
            oVar.c = jSONObject.getString("location");
        }
        if (jSONObject.has("summary")) {
            oVar.d = jSONObject.getString("summary");
        }
        if (jSONObject.has("end")) {
            oVar.e = simpleDateFormat.parse(jSONObject.getString("end"));
        }
        if (jSONObject.has("status")) {
            oVar.f = jSONObject.getString("status");
        }
        if (jSONObject.has("transparency")) {
            oVar.g = jSONObject.getString("transparency");
        }
        if (jSONObject.has("recurrence")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("recurrence");
            StringBuilder sb = new StringBuilder();
            if (!jSONObject2.isNull("frequency")) {
                try {
                    sb.append("FREQ=");
                    sb.append(jSONObject2.getString("frequency"));
                    sb.append(";");
                } catch (Exception unused) {
                }
            }
            if (!jSONObject2.isNull("interval")) {
                try {
                    sb.append("INTERVAL=");
                    sb.append(jSONObject2.getInt("interval"));
                    sb.append(";");
                } catch (Exception unused2) {
                }
            }
            if (!jSONObject2.isNull("expires")) {
                try {
                    Date date2 = simpleDateFormat.parse(jSONObject2.getString("expires"));
                    sb.append("UNTIL=");
                    sb.append(date2);
                    sb.append(";");
                } catch (Exception unused3) {
                }
            }
            try {
                if (!jSONObject2.isNull("frequency") && "weekly".equalsIgnoreCase(jSONObject2.getString("frequency")) && !jSONObject2.isNull("daysInWeek")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("daysInWeek");
                    if (jSONArray.length() > 0) {
                        sb.append("BYDAY=");
                        StringBuilder sb2 = new StringBuilder();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            if (i > 0) {
                                sb2.append(",");
                            }
                            int i2 = jSONArray.getInt(i);
                            if (i2 >= 0 && i2 <= 6) {
                                sb2.append(b[i2]);
                            }
                        }
                        sb.append(sb2.toString());
                        sb.append(";");
                    }
                }
            } catch (Exception unused4) {
            }
            try {
                if (!jSONObject2.isNull("frequency") && "monthly".equalsIgnoreCase(jSONObject2.getString("frequency"))) {
                    if (!jSONObject2.isNull("daysInMonth")) {
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("daysInMonth");
                        if (jSONArray2.length() > 0) {
                            sb.append("BYMONTHDAY=");
                            sb.append(b(jSONArray2));
                            sb.append(";");
                        }
                    }
                    if (!jSONObject2.isNull("weeksInMonth")) {
                        JSONArray jSONArray3 = jSONObject2.getJSONArray("weeksInMonth");
                        if (jSONArray3.length() > 0) {
                            sb.append("BYWEEKNO=");
                            sb.append(b(jSONArray3));
                            sb.append(";");
                        }
                    }
                }
            } catch (Exception unused5) {
            }
            try {
                if (!jSONObject2.isNull("frequency") && "yearly".equalsIgnoreCase(jSONObject2.getString("frequency"))) {
                    if (!jSONObject2.isNull("monthsInYear")) {
                        JSONArray jSONArray4 = jSONObject2.getJSONArray("monthsInYear");
                        if (jSONArray4.length() > 0) {
                            sb.append("BYMONTH=");
                            sb.append(b(jSONArray4));
                            sb.append(";");
                        }
                    }
                    if (!jSONObject2.isNull("daysInYear")) {
                        JSONArray jSONArray5 = jSONObject2.getJSONArray("daysInYear");
                        if (jSONArray5.length() > 0) {
                            sb.append("BYYEARDAY=");
                            sb.append(b(jSONArray5));
                            sb.append(";");
                        }
                    }
                }
            } catch (Exception unused6) {
            }
            oVar.h = sb.length() > 0 ? sb.toString() : null;
        }
        return oVar;
    }

    public static String b(JSONArray jSONArray) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(jSONArray.get(i).toString());
        }
        return sb.toString();
    }
}
