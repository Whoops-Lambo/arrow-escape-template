package io.p071bidmachine.media3.exoplayer.dash;

import android.net.Uri;
import android.text.TextUtils;
import com.singular.sdk.internal.UserDetailsUtils;
import io.p071bidmachine.media3.common.g0;
import io.p071bidmachine.media3.datasource.j;
import io.p071bidmachine.media3.exoplayer.upstream.n;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class g implements n {
    public static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // io.p071bidmachine.media3.exoplayer.upstream.n
    public final Object j(Uri uri, j jVar) throws IOException {
        String line = new BufferedReader(new InputStreamReader(jVar, StandardCharsets.UTF_8)).readLine();
        try {
            Matcher matcher = a.matcher(line);
            if (!matcher.matches()) {
                throw g0.c("Couldn't parse timestamp: " + line, null);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j = UserDetailsUtils.UserDetailsLiterals.PLUS.equals(matcher.group(4)) ? 1L : -1L;
                long j2 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= (((j2 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000) * j;
            }
            return Long.valueOf(time);
        } catch (ParseException e) {
            throw g0.c(null, e);
        }
    }
}
