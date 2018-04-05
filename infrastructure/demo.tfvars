java_opts = ""

////////////////////////////////////////////////
// Endpoints
////////////////////////////////////////////////
idam_api_url = "https://preprod-idamapi.reform.hmcts.net:3511"
s2s_url = "https://preprod-s2s-api.reform.hmcts.net:3511"

////////////////////////////////////////////////
// Logging
////////////////////////////////////////////////
root_appender = "JSON_CONSOLE"
json_console_pretty_print = "false"
log_output = "single"
root_logging_level = "INFO"
log_level_spring_web = "INFO"
log_level_dm = "INFO"
show_sql = "false"
endpoints_health_sensitive = "true"
endpoints_info_sensitive = "true"

////////////////////////////////////////////////
// Toggle Features
////////////////////////////////////////////////
//enable_idam_healthcheck = "false"

//// Whitelists
//s2s_names_whitelist = "em_api,em_gw,ccd,sscs,divorce_document_upload,divorce_document_generator"
//case_worker_roles = "caseworker-probate,caseworker-cmc,caseworker-sscs,caseworker-divorce"

// Addtional