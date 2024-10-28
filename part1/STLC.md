# STLC for LinkedIn Mobile Application

## Test Ideas

### Functional Testing

**Login/Signup:**

- Verify login using email and password, Google/Facebook integration, and OTP verification.
- Verify new user registration with different inputs (valid/invalid emails, missing fields, etc.).

**Profile Creation/Update:**

- Add/edit profile information (name, photo, experience, education, certifications).
- Test for data validation, mandatory fields, and uploading profile pictures.

**News Feed:**

- Verify that posts (text, image, video) are loading and displayed correctly.
- Check the accuracy of likes, comments, reposts, and reshares.

**Search Functionality:**

- Test search for people, posts, jobs, groups, courses, etc.
- Verify filtering and sorting options (location, job title, experience level, job type etc.).

**Job Application:**

- Test applying for a job and tracking application status.

**Connections:**

- Sending, accepting, and rejecting connection requests.
- Suggestions for people you may know.

**Messages:**

- Send/receive messages with different media types (text, attachments, emojis).
- Test group messaging and conversation archiving.

**Notifications:**

- Check push notifications for connection requests, messages, likes, comments, job alerts, etc.

**Account Settings:**

- Verify updating privacy settings, email preferences, and notification settings.
- Testing account deletion.

### Usability Testing

**UI/UX Testing:**

- Verify that navigation between screens is intuitive and smooth.
- Check for consistent design across different devices and screen resolutions.

**Accessibility:**

- Ensure features like screen readers, font resizing, and high contrast mode are accessible.

### Performance Testing

**Load Time:**

- Measure the time it takes for different features (login, feed load, message send) to execute.

**Battery Consumption:**

- Test how the LinkedIn app impacts battery life, especially with prolonged use.

### Security Testing

**Authentication & Authorization:**

- Verify secure login with two-factor authentication.

**Data Privacy:**

- Ensure personal information is protected and not visible without proper authorization.

### Prioritization of Test Cases (Based on Business Impact)

**Login/Signup** – High Priority  
*Business Impact:* Essential for user access and engagement.

**Job Application** – High Priority  
*Business Impact:* Key feature for LinkedIn’s recruitment business.

**Search Functionality** – High Priority  
*Business Impact:* Important for job seekers and recruiters to find relevant opportunities/people.

**Performance Testing (Load Time)** – High Priority  
*Business Impact:* Users may abandon the app if it is slow or unresponsive.

**Security Testing (Authentication & Data Privacy)** – High Priority  
*Business Impact:* Data breaches can significantly impact LinkedIn’s reputation.

**Notifications** – Medium Priority  
*Business Impact:* Keeps users engaged with alerts but does not block critical functionality.

**Profile Update** – Medium Priority  
*Business Impact:* Keeps the user's profile accurate and engaging, but not a daily activity.

**Messages** – Medium Priority  
*Business Impact:* Important for user engagement but less critical than jobs.
