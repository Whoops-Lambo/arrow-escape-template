package defpackage;

import com.tiktok.appevents.contents.TTContentsEventConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public enum hy {
    UNLOCKED_ACHIEVEMENT("AchievementUnlocked"),
    ACTIVATED_APP("ActivateApp"),
    ADDED_PAYMENT_INFO("AddPaymentInfo"),
    ADDED_TO_CART(TTContentsEventConstants.ContentsEventName.EVENT_NAME_ADD_TO_CARD),
    ADDED_TO_WISHLIST(TTContentsEventConstants.ContentsEventName.EVENT_NAME_ADD_TO_WISHLIST),
    COMPLETED_REGISTRATION("CompleteRegistration"),
    VIEWED_CONTENT(TTContentsEventConstants.ContentsEventName.EVENT_NAME_VIEW_CONTENT),
    INITIATED_CHECKOUT("InitiateCheckout"),
    ACHIEVED_LEVEL("LevelAchieved"),
    PURCHASED(TTContentsEventConstants.ContentsEventName.EVENT_NAME_PURCHASE),
    RATED("Rate"),
    SEARCHED("Search"),
    SPENT_CREDITS("SpentCredits"),
    COMPLETED_TUTORIAL("TutorialCompletion");

    public final String a;

    hy(String str) {
        this.a = str;
    }
}
