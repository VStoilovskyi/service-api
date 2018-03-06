/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq;

import com.epam.ta.reportportal.store.jooq.tables.*;
import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;

import javax.annotation.Generated;

/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.5" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

	// -------------------------------------------------------------------------
	// INDEX definitions
	// -------------------------------------------------------------------------

	public static final Index BUG_TRACKING_SYSTEM_PK = Indexes0.BUG_TRACKING_SYSTEM_PK;
	public static final Index DASHBOARD_PK = Indexes0.DASHBOARD_PK;
	public static final Index UNQ_NAME_PROJECT = Indexes0.UNQ_NAME_PROJECT;
	public static final Index DASHBOARD_WIDGET_PK = Indexes0.DASHBOARD_WIDGET_PK;
	public static final Index WIDGET_ON_DASHBOARD_UNQ = Indexes0.WIDGET_ON_DASHBOARD_UNQ;
	public static final Index DEFECT_FIELD_ALLOWED_VALUE_PK = Indexes0.DEFECT_FIELD_ALLOWED_VALUE_PK;
	public static final Index DEFECT_FORM_FIELD_PK = Indexes0.DEFECT_FORM_FIELD_PK;
	public static final Index ISSUE_PK = Indexes0.ISSUE_PK;
	public static final Index ISSUE_TEST_ITEM_RESULTS_ID_KEY = Indexes0.ISSUE_TEST_ITEM_RESULTS_ID_KEY;
	public static final Index ISSUE_TICKET_PK = Indexes0.ISSUE_TICKET_PK;
	public static final Index ISSUE_TYPE_PK = Indexes0.ISSUE_TYPE_PK;
	public static final Index ISSUE_TYPE_PROJECT_CONFIGURATION_PK = Indexes0.ISSUE_TYPE_PROJECT_CONFIGURATION_PK;
	public static final Index ITEM_TAG_PK = Indexes0.ITEM_TAG_PK;
	public static final Index LAUNCH_PK = Indexes0.LAUNCH_PK;
	public static final Index UNQ_NAME_NUMBER = Indexes0.UNQ_NAME_NUMBER;
	public static final Index LAUNCH_TAG_PK = Indexes0.LAUNCH_TAG_PK;
	public static final Index LOG_PK = Indexes0.LOG_PK;
	public static final Index ACCESS_TOKENS_PK = Indexes0.ACCESS_TOKENS_PK;
	public static final Index OAUTH_REGISTRATION_CLIENT_ID_KEY = Indexes0.OAUTH_REGISTRATION_CLIENT_ID_KEY;
	public static final Index OAUTH_REGISTRATION_PKEY = Indexes0.OAUTH_REGISTRATION_PKEY;
	public static final Index PROJECT_PK = Indexes0.PROJECT_PK;
	public static final Index PROJECT_PROJECT_CONFIGURATION_ID_KEY = Indexes0.PROJECT_PROJECT_CONFIGURATION_ID_KEY;
	public static final Index PROJECT_CONFIGURATION_EMAIL_CONFIGURATION_ID_KEY = Indexes0.PROJECT_CONFIGURATION_EMAIL_CONFIGURATION_ID_KEY;
	public static final Index PROJECT_CONFIGURATION_PK = Indexes0.PROJECT_CONFIGURATION_PK;
	public static final Index PROJECT_EMAIL_CONFIGURATION_PK = Indexes0.PROJECT_EMAIL_CONFIGURATION_PK;
	public static final Index USERS_PROJECT_PK = Indexes0.USERS_PROJECT_PK;
	public static final Index SERVER_SETTINGS_ID = Indexes0.SERVER_SETTINGS_ID;
	public static final Index TEST_ITEM_PK = Indexes0.TEST_ITEM_PK;
	public static final Index TEST_ITEM_RESULTS_ITEM_ID_KEY = Indexes0.TEST_ITEM_RESULTS_ITEM_ID_KEY;
	public static final Index TEST_ITEM_RESULTS_PK = Indexes0.TEST_ITEM_RESULTS_PK;
	public static final Index TEST_ITEM_STRUCTURE_ITEM_ID_KEY = Indexes0.TEST_ITEM_STRUCTURE_ITEM_ID_KEY;
	public static final Index TEST_ITEM_STRUCTURE_PK = Indexes0.TEST_ITEM_STRUCTURE_PK;
	public static final Index TICKET_PK = Indexes0.TICKET_PK;
	public static final Index TICKET_TICKET_ID_KEY = Indexes0.TICKET_TICKET_ID_KEY;
	public static final Index USERS_LOGIN_KEY = Indexes0.USERS_LOGIN_KEY;
	public static final Index USERS_PK = Indexes0.USERS_PK;
	public static final Index WIDGET_ID = Indexes0.WIDGET_ID;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Indexes0 {
		public static Index BUG_TRACKING_SYSTEM_PK = Internal.createIndex(
				"bug_tracking_system_pk",
				JBugTrackingSystem.BUG_TRACKING_SYSTEM,
				new OrderField[] { JBugTrackingSystem.BUG_TRACKING_SYSTEM.ID },
				true
		);
		public static Index DASHBOARD_PK = Internal.createIndex(
				"dashboard_pk",
				JDashboard.DASHBOARD,
				new OrderField[] { JDashboard.DASHBOARD.ID },
				true
		);
		public static Index UNQ_NAME_PROJECT = Internal.createIndex(
				"unq_name_project",
				JDashboard.DASHBOARD,
				new OrderField[] { JDashboard.DASHBOARD.NAME, JDashboard.DASHBOARD.PROJECT_ID },
				true
		);
		public static Index DASHBOARD_WIDGET_PK = Internal.createIndex(
				"dashboard_widget_pk",
				JDashboardWidget.DASHBOARD_WIDGET,
				new OrderField[] { JDashboardWidget.DASHBOARD_WIDGET.DASHBOARD_ID, JDashboardWidget.DASHBOARD_WIDGET.WIDGET_ID },
				true
		);
		public static Index WIDGET_ON_DASHBOARD_UNQ = Internal.createIndex(
				"widget_on_dashboard_unq",
				JDashboardWidget.DASHBOARD_WIDGET,
				new OrderField[] { JDashboardWidget.DASHBOARD_WIDGET.DASHBOARD_ID, JDashboardWidget.DASHBOARD_WIDGET.WIDGET_NAME },
				true
		);
		public static Index DEFECT_FIELD_ALLOWED_VALUE_PK = Internal.createIndex(
				"defect_field_allowed_value_pk",
				JDefectFieldAllowedValue.DEFECT_FIELD_ALLOWED_VALUE,
				new OrderField[] { JDefectFieldAllowedValue.DEFECT_FIELD_ALLOWED_VALUE.ID },
				true
		);
		public static Index DEFECT_FORM_FIELD_PK = Internal.createIndex(
				"defect_form_field_pk",
				JDefectFormField.DEFECT_FORM_FIELD,
				new OrderField[] { JDefectFormField.DEFECT_FORM_FIELD.ID },
				true
		);
		public static Index ISSUE_PK = Internal.createIndex("issue_pk", JIssue.ISSUE, new OrderField[] { JIssue.ISSUE.ID }, true);
		public static Index ISSUE_TEST_ITEM_RESULTS_ID_KEY = Internal.createIndex(
				"issue_test_item_results_id_key",
				JIssue.ISSUE,
				new OrderField[] { JIssue.ISSUE.TEST_ITEM_RESULTS_ID },
				true
		);
		public static Index ISSUE_TICKET_PK = Internal.createIndex(
				"issue_ticket_pk",
				JIssueTicket.ISSUE_TICKET,
				new OrderField[] { JIssueTicket.ISSUE_TICKET.ISSUE_ID, JIssueTicket.ISSUE_TICKET.TICKET_ID },
				true
		);
		public static Index ISSUE_TYPE_PK = Internal.createIndex(
				"issue_type_pk",
				JIssueType.ISSUE_TYPE,
				new OrderField[] { JIssueType.ISSUE_TYPE.ID },
				true
		);
		public static Index ISSUE_TYPE_PROJECT_CONFIGURATION_PK = Internal.createIndex(
				"issue_type_project_configuration_pk",
				JIssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION,
				new OrderField[] { JIssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION.CONFIGURATION_ID,
						JIssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION.ISSUE_TYPE_ID },
				true
		);
		public static Index ITEM_TAG_PK = Internal.createIndex(
				"item_tag_pk",
				JItemTag.ITEM_TAG,
				new OrderField[] { JItemTag.ITEM_TAG.ID },
				true
		);
		public static Index LAUNCH_PK = Internal.createIndex("launch_pk", JLaunch.LAUNCH, new OrderField[] { JLaunch.LAUNCH.ID }, true);
		public static Index UNQ_NAME_NUMBER = Internal.createIndex(
				"unq_name_number",
				JLaunch.LAUNCH,
				new OrderField[] { JLaunch.LAUNCH.NAME, JLaunch.LAUNCH.NUMBER, JLaunch.LAUNCH.PROJECT_ID },
				true
		);
		public static Index LAUNCH_TAG_PK = Internal.createIndex(
				"launch_tag_pk",
				JLaunchTag.LAUNCH_TAG,
				new OrderField[] { JLaunchTag.LAUNCH_TAG.ID },
				true
		);
		public static Index LOG_PK = Internal.createIndex("log_pk", JLog.LOG, new OrderField[] { JLog.LOG.ID }, true);
		public static Index ACCESS_TOKENS_PK = Internal.createIndex(
				"access_tokens_pk",
				JOauthAccessToken.OAUTH_ACCESS_TOKEN,
				new OrderField[] { JOauthAccessToken.OAUTH_ACCESS_TOKEN.USER_ID, JOauthAccessToken.OAUTH_ACCESS_TOKEN.TOKEN_TYPE },
				true
		);
		public static Index OAUTH_REGISTRATION_CLIENT_ID_KEY = Internal.createIndex(
				"oauth_registration_client_id_key",
				JOauthRegistration.OAUTH_REGISTRATION,
				new OrderField[] { JOauthRegistration.OAUTH_REGISTRATION.CLIENT_ID },
				true
		);
		public static Index OAUTH_REGISTRATION_PKEY = Internal.createIndex(
				"oauth_registration_pkey",
				JOauthRegistration.OAUTH_REGISTRATION,
				new OrderField[] { JOauthRegistration.OAUTH_REGISTRATION.ID },
				true
		);
		public static Index PROJECT_PK = Internal.createIndex(
				"project_pk",
				JProject.PROJECT,
				new OrderField[] { JProject.PROJECT.ID },
				true
		);
		public static Index PROJECT_PROJECT_CONFIGURATION_ID_KEY = Internal.createIndex(
				"project_project_configuration_id_key",
				JProject.PROJECT,
				new OrderField[] { JProject.PROJECT.PROJECT_CONFIGURATION_ID },
				true
		);
		public static Index PROJECT_CONFIGURATION_EMAIL_CONFIGURATION_ID_KEY = Internal.createIndex(
				"project_configuration_email_configuration_id_key",
				JProjectConfiguration.PROJECT_CONFIGURATION,
				new OrderField[] { JProjectConfiguration.PROJECT_CONFIGURATION.EMAIL_CONFIGURATION_ID },
				true
		);
		public static Index PROJECT_CONFIGURATION_PK = Internal.createIndex(
				"project_configuration_pk",
				JProjectConfiguration.PROJECT_CONFIGURATION,
				new OrderField[] { JProjectConfiguration.PROJECT_CONFIGURATION.ID },
				true
		);
		public static Index PROJECT_EMAIL_CONFIGURATION_PK = Internal.createIndex(
				"project_email_configuration_pk",
				JProjectEmailConfiguration.PROJECT_EMAIL_CONFIGURATION,
				new OrderField[] { JProjectEmailConfiguration.PROJECT_EMAIL_CONFIGURATION.ID },
				true
		);
		public static Index USERS_PROJECT_PK = Internal.createIndex(
				"users_project_pk",
				JProjectUser.PROJECT_USER,
				new OrderField[] { JProjectUser.PROJECT_USER.USER_ID, JProjectUser.PROJECT_USER.PROJECT_ID },
				true
		);
		public static Index SERVER_SETTINGS_ID = Internal.createIndex(
				"server_settings_id",
				JServerSettings.SERVER_SETTINGS,
				new OrderField[] { JServerSettings.SERVER_SETTINGS.ID },
				true
		);
		public static Index TEST_ITEM_PK = Internal.createIndex(
				"test_item_pk",
				JTestItem.TEST_ITEM,
				new OrderField[] { JTestItem.TEST_ITEM.ID },
				true
		);
		public static Index TEST_ITEM_RESULTS_ITEM_ID_KEY = Internal.createIndex(
				"test_item_results_item_id_key",
				JTestItemResults.TEST_ITEM_RESULTS,
				new OrderField[] { JTestItemResults.TEST_ITEM_RESULTS.ITEM_ID },
				true
		);
		public static Index TEST_ITEM_RESULTS_PK = Internal.createIndex(
				"test_item_results_pk",
				JTestItemResults.TEST_ITEM_RESULTS,
				new OrderField[] { JTestItemResults.TEST_ITEM_RESULTS.ID },
				true
		);
		public static Index TEST_ITEM_STRUCTURE_ITEM_ID_KEY = Internal.createIndex(
				"test_item_structure_item_id_key",
				JTestItemStructure.TEST_ITEM_STRUCTURE,
				new OrderField[] { JTestItemStructure.TEST_ITEM_STRUCTURE.ITEM_ID },
				true
		);
		public static Index TEST_ITEM_STRUCTURE_PK = Internal.createIndex(
				"test_item_structure_pk",
				JTestItemStructure.TEST_ITEM_STRUCTURE,
				new OrderField[] { JTestItemStructure.TEST_ITEM_STRUCTURE.ID },
				true
		);
		public static Index TICKET_PK = Internal.createIndex("ticket_pk", JTicket.TICKET, new OrderField[] { JTicket.TICKET.ID }, true);
		public static Index TICKET_TICKET_ID_KEY = Internal.createIndex(
				"ticket_ticket_id_key",
				JTicket.TICKET,
				new OrderField[] { JTicket.TICKET.TICKET_ID },
				true
		);
		public static Index USERS_LOGIN_KEY = Internal.createIndex(
				"users_login_key",
				JUsers.USERS,
				new OrderField[] { JUsers.USERS.LOGIN },
				true
		);
		public static Index USERS_PK = Internal.createIndex("users_pk", JUsers.USERS, new OrderField[] { JUsers.USERS.ID }, true);
		public static Index WIDGET_ID = Internal.createIndex("widget_id", JWidget.WIDGET, new OrderField[] { JWidget.WIDGET.ID }, true);
	}
}
