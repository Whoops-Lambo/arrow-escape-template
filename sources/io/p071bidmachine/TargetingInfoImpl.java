package io.p071bidmachine;

import android.location.Location;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import io.p071bidmachine.models.g;
import io.p071bidmachine.utils.e;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0016\u0010 \u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\tR\u0016\u0010$\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\tR\u0016\u0010&\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lio/bidmachine/TargetingInfoImpl;", "Lio/bidmachine/models/g;", "Lio/bidmachine/TargetingParams;", "targetingParams", "<init>", "(Lio/bidmachine/TargetingParams;)V", "Lio/bidmachine/TargetingParams;", "", "getUserId", "()Ljava/lang/String;", "userId", "Lio/bidmachine/utils/e;", "getGender", "()Lio/bidmachine/utils/e;", InneractiveMediationDefs.KEY_GENDER, "", "getUserBirthdayYear", "()Ljava/lang/Integer;", "userBirthdayYear", "getUserAge", "userAge", "", "getKeywords", "()Ljava/util/List;", "keywords", "Landroid/location/Location;", "getDeviceLocation", "()Landroid/location/Location;", "deviceLocation", "getCountry", "country", "getCity", "city", "getZip", "zip", "getStoreUrl", "storeUrl", "", "isPaid", "()Ljava/lang/Boolean;", "bidmachine-android-sdk_ba_3_8_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class TargetingInfoImpl implements g {

    @NotNull
    private final TargetingParams targetingParams;

    @Nullable
    public String getCity() {
        return this.targetingParams.getCity();
    }

    @Nullable
    public String getCountry() {
        return this.targetingParams.getCountry();
    }

    @Nullable
    public Location getDeviceLocation() {
        return this.targetingParams.getDeviceLocation();
    }

    @Nullable
    public e getGender() {
        return this.targetingParams.getGender();
    }

    @Nullable
    public List<String> getKeywords() {
        return this.targetingParams.getKeywords();
    }

    @Nullable
    public String getStoreUrl() {
        return this.targetingParams.getStoreUrl();
    }

    @Nullable
    public Integer getUserBirthdayYear() {
        return this.targetingParams.getBirthdayYear();
    }

    @Nullable
    public String getUserId() {
        return this.targetingParams.getUserId();
    }

    @Nullable
    public String getZip() {
        return this.targetingParams.getZip();
    }

    @Nullable
    public Boolean isPaid() {
        return this.targetingParams.getPaid();
    }

    public TargetingInfoImpl(@NotNull TargetingParams targetingParams) {
        targetingParams.getClass();
        this.targetingParams = targetingParams;
    }

    @Nullable
    public Integer getUserAge() {
        Integer userBirthdayYear = getUserBirthdayYear();
        if (userBirthdayYear != null) {
            return Integer.valueOf(Calendar.getInstance().get(1) - userBirthdayYear.intValue());
        }
        return null;
    }
}
