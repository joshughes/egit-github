/******************************************************************************
 *  Copyright (c) 2011 GitHub Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *    Kevin Sawicki (GitHub Inc.) - initial API and implementation
 *****************************************************************************/
package org.eclipse.egit.github.core;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.eclipse.egit.github.core.util.DateUtils;

/**
 * Repository hook model class
 */
public class RepositoryHook implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = -9023469643749604324L;

	/**
	 *  Any git push to a Repository.
	 */
	public static final String PUSH = "push"; //$NON-NLS-1$

	/**
	 * Any time an Issue is opened or closed.
	 */
	public static final String ISSUES = "issues"; //$NON-NLS-1$

	/**
	 * Any time an Issue is commented on.
	 */
	public static final String ISSUE_COMMENT = "issue_comment"; //$NON-NLS-1$

	/**
	 * Any time a Commit is commented on.
	 */
	public static final String COMMIT_COMMENT = "commit_comment"; //$NON-NLS-1$

	/**
	 * Any time a Pull Request is opened, closed, or synchronized
	 */
	public static final String PULL_REQUEST = "pull_request"; //$NON-NLS-1$

	/**
	 * Any time a Commit is commented on while inside a Pull Request review
	 */
	public static final String PULL_REQUEST_REVIEW_COMMENT = "pull_request_review_comment"; //$NON-NLS-1$

	/**
	 * Any time a Wiki page is updated.
	 */
	public static final String GOLLUM = "gollum"; //$NON-NLS-1$

	/**
	 * Any time a User watches the Repository.
	 */
	public static final String WATCH = "watch"; //$NON-NLS-1$

	/**
	 * Any time a Download is added to the Repository.
	 */
	public static final String DOWNLOAD = "download"; //$NON-NLS-1$

	/**
	 * Any time a Download is added to the Repository.
	 */
	public static final String FORK = "fork"; //$NON-NLS-1$

	/**
	 * Any time a patch is applied to the Repository from the Fork Queue.
	 */
	public static final String FORK_APPLY = "fork_apply"; //$NON-NLS-1$

	/**
	 * Any time a User is added as a collaborator to a non-Organization Repository.
	 */
	public static final String MEMBER = "member"; //$NON-NLS-1$

	/**
	 * Any time a Repository changes from private to public.
	 */
	public static final String PUBLIC = "public"; //$NON-NLS-1$

	/**
	 * Any time a team is added or modified on a Repository.
	 */
	public static final String TEAM_ADD = "team_add"; //$NON-NLS-1$

	/**
	 * Any time a Repository has a status update from the API
	 */
	public static final String STATUS = "status"; //$NON-NLS-1$

	private boolean active;

	private Date createdAt;

	private Date updatedAt;

	private long id;

	private List<String> events;

	private RepositoryHookResponse lastResponse;

	private String name;

	private String url;

	private Map<String, String> config;

	/**
	 * @return active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active
	 * @return this hook
	 */
	public RepositoryHook setActive(boolean active) {
		this.active = active;
		return this;
	}

	/**
	 * @return createdAt
	 */
	public Date getCreatedAt() {
		return DateUtils.clone(createdAt);
	}

	/**
	 * @param createdAt
	 * @return this hook
	 */
	public RepositoryHook setCreatedAt(Date createdAt) {
		this.createdAt = DateUtils.clone(createdAt);
		return this;
	}

	/**
	 * @return updatedAt
	 */
	public Date getUpdatedAt() {
		return DateUtils.clone(updatedAt);
	}

	/**
	 * @param updatedAt
	 * @return this hook
	 */
	public RepositoryHook setUpdatedAt(Date updatedAt) {
		this.updatedAt = DateUtils.clone(updatedAt);
		return this;
	}

	/**
	 * @return id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 * @return this hook
	 */
	public RepositoryHook setId(long id) {
		this.id = id;
		return this;
	}

	/**
	 * @return lastResponse
	 */
	public RepositoryHookResponse getLastResponse() {
		return lastResponse;
	}

	/**
	 * @param lastResponse
	 * @return this hook
	 */
	public RepositoryHook setLastResponse(RepositoryHookResponse lastResponse) {
		this.lastResponse = lastResponse;
		return this;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 * @return this hook
	 */
	public RepositoryHook setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 * @return this hook
	 */
	public RepositoryHook setUrl(String url) {
		this.url = url;
		return this;
	}

	/**
	 * @return config
	 */
	public Map<String, String> getConfig() {
		return config;
	}

	/**
	 * @param config
	 * @return this hook
	 */
	public RepositoryHook setConfig(Map<String, String> config) {
		this.config = config;
		return this;
	}

	/**
	 * @param events
	 * @return this hook
	 */
	public List<String> getEvents() {
		return events;
	}

	/**
	 * @return events
	 */
	public void setEvents(List<String> events) {
		this.events = events;
	}
}
