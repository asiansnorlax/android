package com.owncloud.android.test.ui.testSuites;

import com.owncloud.android.test.ui.groups.FlexibleCategories;
import com.owncloud.android.test.ui.groups.FlexibleCategories.TestClassPrefix;
import com.owncloud.android.test.ui.groups.FlexibleCategories.TestClassSuffix;
import com.owncloud.android.test.ui.groups.FlexibleCategories.TestScanPackage;
import com.owncloud.android.test.ui.groups.InProgressCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;

@RunWith(FlexibleCategories.class)
@IncludeCategory(InProgressCategory.class)
@TestScanPackage("com.owncloud.android.test.ui.testSuites")
@TestClassPrefix("")
@TestClassSuffix("TestSuite")
public class RunInProgressTest {

}
