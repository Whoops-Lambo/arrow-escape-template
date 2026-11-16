package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.applovin.sdk.AppLovinEventParameters;
import com.facebook.a0;
import com.ironsource.C4664b4;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.Executors;
import okhttp3.OkHttpClient;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class u7 extends rc1 implements sr0 {
    public static final u7 A;
    public static final u7 B;
    public static final u7 C;
    public static final u7 D;
    public static final u7 E;
    public static final u7 F;
    public static final u7 G;
    public static final u7 H;
    public static final u7 j;
    public static final u7 k;
    public static final u7 l;
    public static final u7 m;
    public static final u7 n;
    public static final u7 o;
    public static final u7 p;
    public static final u7 q;
    public static final u7 r;
    public static final u7 s;
    public static final u7 t;
    public static final u7 u;
    public static final u7 v;
    public static final u7 w;
    public static final u7 x;
    public static final u7 y;
    public static final u7 z;
    public final /* synthetic */ int i;

    static {
        int i = 0;
        j = new u7(i, 0);
        k = new u7(i, 1);
        l = new u7(i, 2);
        m = new u7(i, 3);
        n = new u7(i, 4);
        o = new u7(i, 5);
        p = new u7(i, 6);
        q = new u7(i, 7);
        r = new u7(i, 8);
        s = new u7(i, 9);
        t = new u7(i, 10);
        u = new u7(i, 11);
        v = new u7(i, 12);
        w = new u7(i, 13);
        x = new u7(i, 14);
        y = new u7(i, 15);
        z = new u7(i, 16);
        A = new u7(i, 17);
        B = new u7(i, 18);
        C = new u7(i, 19);
        D = new u7(i, 20);
        E = new u7(i, 21);
        F = new u7(i, 22);
        G = new u7(i, 23);
        H = new u7(i, 24);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u7(int i, int i2) {
        super(i);
        this.i = i2;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = 0;
        switch (this.i) {
            case 0:
                return a0.a().getSharedPreferences("com.facebook.sdk.APPLINK_INFO", 0);
            case 1:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int i2 = 0;
                while (i < 64) {
                    linkedHashMap.put(String.valueOf("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(i)), Integer.valueOf(i2));
                    i++;
                    i2++;
                }
                return linkedHashMap;
            case 2:
                return new SimpleDateFormat("dd.MM.yyyy, HH:mm", Locale.getDefault());
            case 3:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
                simpleDateFormat.setTimeZone(q50.c);
                return simpleDateFormat;
            case 4:
                return new Handler(Looper.getMainLooper());
            case 5:
                return Executors.newCachedThreadPool();
            case 6:
                return new OkHttpClient();
            case 7:
                return null;
            case 8:
                return new fn();
            case 9:
                return new yp1();
            case 10:
                return xc0.a;
            case 11:
                return new rt0();
            case 12:
                return new cb1();
            case 13:
                ba0 ba0Var = xc0.a;
                return wg1.a;
            case 14:
                return new qq1();
            case 15:
                return new iw2();
            case 16:
                return new iw2();
            case 17:
                return kc2.p("_currency", "_valueToSum", "fb_availability", "fb_body_style", "fb_checkin_date", "fb_checkout_date", "fb_city", "fb_condition_of_vehicle", "fb_content_ids", "fb_content_type", "fb_contents", "fb_country", "fb_currency", "fb_delivery_category", "fb_departing_arrival_date", "fb_departing_departure_date", "fb_destination_airport", "fb_destination_ids", "fb_dma_code", "fb_drivetrain", "fb_exterior_color", "fb_fuel_type", "fb_hotel_score", "fb_interior_color", "fb_lease_end_date", "fb_lease_start_date", "fb_listing_type", "fb_make", "fb_mileage.unit", "fb_mileage.value", "fb_model", "fb_neighborhood", "fb_num_adults", "fb_num_children", "fb_num_infants", "fb_num_items", "fb_order_id", "fb_origin_airport", "fb_postal_code", "fb_predicted_ltv", "fb_preferred_baths_range", "fb_preferred_beds_range", "fb_preferred_neighborhoods", "fb_preferred_num_stops", "fb_preferred_price_range", "fb_preferred_star_ratings", "fb_price", "fb_property_type", "fb_region", "fb_returning_arrival_date", "fb_returning_departure_date", "fb_state_of_vehicle", "fb_suggested_destinations", "fb_suggested_home_listings", "fb_suggested_hotels", "fb_suggested_jobs", "fb_suggested_local_service_businesses", "fb_suggested_location_based_items", "fb_suggested_vehicles", "fb_transmission", "fb_travel_class", "fb_travel_end", "fb_travel_start", "fb_trim", "fb_user_bucket", "fb_value", "fb_vin", "fb_year", "lead_event_source", "predicted_ltv", "product_catalog_id", "app_user_id", C4664b4.j.W, "_eventName", "_eventName_md5", "_implicitlyLogged", "_inBackground", "_isTimedEvent", "_logTime", "_session_id", "_ui", "_valueToUpdate", "_is_fb_codeless", "_is_suggested_event", "_fb_pixel_referral_id", "fb_pixel_id", "trace_id", "subscription_id", "event_id", "_restrictedParams", "_onDeviceParams", "purchase_valid_result_type", "core_lib_included", "login_lib_included", "share_lib_included", "place_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "_codeless_action", "sdk_initialized", "billing_client_lib_included", "billing_service_lib_included", "user_data_keys", "device_push_token", "fb_mobile_pckg_fp", "fb_mobile_app_cert_hash", "aggregate_id", "anonymous_id", "campaign_ids", "add_to_messaging_customer_base_for_whatsapp", "fb_post_attachment", AppLovinEventParameters.IN_APP_PURCHASE_DATA, "ad_type", "fb_content", "fb_content_id", "fb_description", "fb_level", "fb_max_rating_value", "fb_payment_info_available", "fb_registration_method", "fb_success", "pm", "_audiencePropertyIds", "cs_maca");
            case 18:
                return tw1.a();
            case 19:
                return tw1.a();
            case 20:
                i23 i23Var = tw1.b;
                return i23Var == null ? new xq1() : i23Var;
            case 21:
                return tw1.a;
            case 22:
                return (gw2) tw1.e.getValue();
            case 23:
                i23 i23Var2 = tw1.b;
                return i23Var2 == null ? new xq1() : i23Var2;
            default:
                z23.b.b();
                return az2.a;
        }
    }
}
