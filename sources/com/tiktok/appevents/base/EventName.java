package com.tiktok.appevents.base;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public enum EventName {
    ACHIEVE_LEVEL("AchieveLevel"),
    ADD_PAYMENT_INFO("AddPaymentInfo"),
    COMPLETE_TUTORIAL("CompleteTutorial"),
    CREATE_GROUP("CreateGroup"),
    CREATE_ROLE("CreateRole"),
    GENERATE_LEAD("GenerateLead"),
    IN_APP_AD_CLICK("InAppADClick"),
    IN_APP_AD_IMPR("InAppAdImpr"),
    INSTALL_APP("InstallApp"),
    JOIN_GROUP("JoinGroup"),
    LAUNCH_APP("LaunchAPP"),
    LOAN_APPLICATION("LoanApplication"),
    LOAN_APPROVAL("LoanApproval"),
    LOAN_DISBURSAL("LoanDisbursal"),
    LOGIN("Login"),
    RATE("Rate"),
    REGISTRATION("Registration"),
    SEARCH("Search"),
    SPEND_CREDITS("SpendCredits"),
    START_TRIAL("StartTrial"),
    SUBSCRIBE("Subscribe"),
    IMPRESSION_LEVEL_AD_REVENUE("ImpressionLevelAdRevenue"),
    UNLOCK_ACHIEVEMENT("UnlockAchievement");

    private String eventName;

    @Override // java.lang.Enum
    public String toString() {
        return this.eventName;
    }

    EventName(String str) {
        this.eventName = str;
    }
}
