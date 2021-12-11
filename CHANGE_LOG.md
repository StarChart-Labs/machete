# Change Log
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/)
and this project adheres to [Semantic Versioning](http://semver.org/).

## [Unreleased]
### Changed
- Updated com.amazonaws:aws-java-sdk-ssm from 1.12.40 to 1.12.128
- Updated com.amazonaws:aws-lambda-java-events from 3.9.0 to 3.11.0
- Updated com.fasterxml.jackson.core:jackson-databind from 2.12.4 to 2.13.0
- Updated org.starchartlabs.alloy:alloy-core from 1.0.1 to 1.0.2
- Updated org.mockito:mockito-core from 3.11.2 to 4.1.0

## [1.0.1]
### Changed
- Update com.amazonaws:aws-java-sdk-ssm from 1.11.797 to 1.12.40
- Update com.amazonaws:aws-lambda-java-events from 3.1.0 to 3.9.0
- Update override of com.fasterxml.jackson.core:jackson-databind from 2.11.0 to 2.12.4
- Update org.starchartlabs.alloy:alloy-core from 1.0.0 to 1.0.1
- Update org.mockito:mockito-core from 3.3.3 to 3.11.2
- Update org.testng:testng from 7.1.0 to 7.4.0

## [1.0.0]
### Changed
- (GH-17) Changed module name `org.starchartlabs.machete.machete.sns` to `org.starchartlabs.machete.sns`
- (GH-17) Changed module name `org.starchartlabs.machete.machete.ssm` to `org.starchartlabs.machete.ssm`
- Update com.amazonaws:aws-java-sdk-ssm from 1.11.699 to 1.11.797
- Update com.amazonaws:aws-lambda-java-events from 2.2.7 to 3.1.0
- Update com.fasterxml.jackson.core:jackson-databind override from 2.10.1 to 2.11.0
- Update org.starchartlabs.alloy:alloy-core from 0.5.0 to 1.0.0
- Update org.mockito:mockito-core from 2.28.2 to 3.3.3
- Update org.testng:testng from 6.14.3 to 7.1.0

## [0.2.2]
### Changed
- Updated com.amazonaws:aws-java-sdk-ssm to 1.11.699 fro 1.11.598 for bugfixes and security updates
- Updated com.amazonaws:aws-lambda-java-events to 2.2.7 from 2.2.6 for bugfixes and security updates
- Updated com.fasterxml.jackson.core:jackson-databind to 2.10.1 from 2.9.9.1 for bugfixes and security updates

## [0.2.1]
### Changed

- Updated com.amazonaws:aws-java-sdk-ssm to latest micro version (1.11.598)
- Updated com.fasterxml.jackson.core:jackson-databind to latest micro version (2.9.9.1)
- Updated test dependencies

## [0.2.0]
### Changed

- Updated external dependency versions to latest bugfix releases
- Overrode Jackson dependency version from AWS SDK to version not flagged with vulnerabilities

## [0.1.0]
### Added

- Added org.starchartlabs.machete.ssm.parameter.SecuredParameter for ease of access to encrypted AWS SSM parameter store values
- Added org.starchartlabs.machete.ssm.parameter.SecuredRsaKeyParameter  for ease of access to encrypted AWS SSM parameter store values which are the contents of an RSA key
- Added org.starchartlabs.machete.ssm.parameter.StringParameter for each of access to an un-encrypted AWS SSM value
- Added org.starchartlabs.machete.sns.SnsEvents for utilities related to SNS event processing
