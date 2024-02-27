#!/bin/bash
 
# GitHub Repository Details
USERNAME="GopiUchiha"
REPO_NAME="crmapp"
BRANCH_NAME="New43"
 
# Personal Access Token
TOKEN=""
 
# API URL to create a new branch
API_URL="https://api.github.com/repos/${USERNAME}/${REPO_NAME}/git/refs"
 
# Create Branch Payload
PAYLOAD='{
  "ref": "refs/heads/'$BRANCH_NAME'",
  "sha": "$(curl -s https://api.github.com/repos/${USERNAME}/${REPO_NAME}/git/refs/heads/main | jq -r .object.sha)"
}'
 
# Create Branch using API
curl -X POST -H "Authorization: token ${TOKEN}" -d "${PAYLOAD}" "${API_URL}"