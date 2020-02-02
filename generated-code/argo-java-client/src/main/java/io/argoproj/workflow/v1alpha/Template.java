/*
 * Argo
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2.5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.v1alpha;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.workflow.v1alpha.Arguments;
import io.argoproj.workflow.v1alpha.ArtifactLocation;
import io.argoproj.workflow.v1alpha.DAGTemplate;
import io.argoproj.workflow.v1alpha.ExecutorConfig;
import io.argoproj.workflow.v1alpha.Inputs;
import io.argoproj.workflow.v1alpha.Metadata;
import io.argoproj.workflow.v1alpha.Outputs;
import io.argoproj.workflow.v1alpha.ParallelSteps;
import io.argoproj.workflow.v1alpha.ResourceTemplate;
import io.argoproj.workflow.v1alpha.RetryStrategy;
import io.argoproj.workflow.v1alpha.ScriptTemplate;
import io.argoproj.workflow.v1alpha.SuspendTemplate;
import io.argoproj.workflow.v1alpha.TemplateRef;
import io.argoproj.workflow.v1alpha.UserContainer;
import io.kubernetes.client.models.V1Affinity;
import io.kubernetes.client.models.V1Container;
import io.kubernetes.client.models.V1HostAlias;
import io.kubernetes.client.models.V1PodSecurityContext;
import io.kubernetes.client.models.V1Toleration;
import io.kubernetes.client.models.V1Volume;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Template is a reusable and composable unit of execution in a workflow
 */
@ApiModel(description = "Template is a reusable and composable unit of execution in a workflow")

public class Template {
  public static final String SERIALIZED_NAME_ACTIVE_DEADLINE_SECONDS = "activeDeadlineSeconds";
  @SerializedName(SERIALIZED_NAME_ACTIVE_DEADLINE_SECONDS)
  private Long activeDeadlineSeconds;

  public static final String SERIALIZED_NAME_AFFINITY = "affinity";
  @SerializedName(SERIALIZED_NAME_AFFINITY)
  private V1Affinity affinity = null;

  public static final String SERIALIZED_NAME_ARCHIVE_LOCATION = "archiveLocation";
  @SerializedName(SERIALIZED_NAME_ARCHIVE_LOCATION)
  private ArtifactLocation archiveLocation;

  public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private Arguments arguments;

  public static final String SERIALIZED_NAME_AUTOMOUNT_SERVICE_ACCOUNT_TOKEN = "automountServiceAccountToken";
  @SerializedName(SERIALIZED_NAME_AUTOMOUNT_SERVICE_ACCOUNT_TOKEN)
  private Boolean automountServiceAccountToken;

  public static final String SERIALIZED_NAME_CONTAINER = "container";
  @SerializedName(SERIALIZED_NAME_CONTAINER)
  private V1Container container = null;

  public static final String SERIALIZED_NAME_DAEMON = "daemon";
  @SerializedName(SERIALIZED_NAME_DAEMON)
  private Boolean daemon;

  public static final String SERIALIZED_NAME_DAG = "dag";
  @SerializedName(SERIALIZED_NAME_DAG)
  private DAGTemplate dag;

  public static final String SERIALIZED_NAME_EXECUTOR = "executor";
  @SerializedName(SERIALIZED_NAME_EXECUTOR)
  private ExecutorConfig executor;

  public static final String SERIALIZED_NAME_HOST_ALIASES = "hostAliases";
  @SerializedName(SERIALIZED_NAME_HOST_ALIASES)
  private List<V1HostAlias> hostAliases = null;

  public static final String SERIALIZED_NAME_INIT_CONTAINERS = "initContainers";
  @SerializedName(SERIALIZED_NAME_INIT_CONTAINERS)
  private List<UserContainer> initContainers = null;

  public static final String SERIALIZED_NAME_INPUTS = "inputs";
  @SerializedName(SERIALIZED_NAME_INPUTS)
  private Inputs inputs;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Metadata metadata;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private Map<String, String> nodeSelector = null;

  public static final String SERIALIZED_NAME_OUTPUTS = "outputs";
  @SerializedName(SERIALIZED_NAME_OUTPUTS)
  private Outputs outputs;

  public static final String SERIALIZED_NAME_PARALLELISM = "parallelism";
  @SerializedName(SERIALIZED_NAME_PARALLELISM)
  private Long parallelism;

  public static final String SERIALIZED_NAME_POD_SPEC_PATCH = "podSpecPatch";
  @SerializedName(SERIALIZED_NAME_POD_SPEC_PATCH)
  private String podSpecPatch;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_PRIORITY_CLASS_NAME = "priorityClassName";
  @SerializedName(SERIALIZED_NAME_PRIORITY_CLASS_NAME)
  private String priorityClassName;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private ResourceTemplate resource;

  public static final String SERIALIZED_NAME_RETRY_STRATEGY = "retryStrategy";
  @SerializedName(SERIALIZED_NAME_RETRY_STRATEGY)
  private RetryStrategy retryStrategy;

  public static final String SERIALIZED_NAME_SCHEDULER_NAME = "schedulerName";
  @SerializedName(SERIALIZED_NAME_SCHEDULER_NAME)
  private String schedulerName;

  public static final String SERIALIZED_NAME_SCRIPT = "script";
  @SerializedName(SERIALIZED_NAME_SCRIPT)
  private ScriptTemplate script;

  public static final String SERIALIZED_NAME_SECURITY_CONTEXT = "securityContext";
  @SerializedName(SERIALIZED_NAME_SECURITY_CONTEXT)
  private V1PodSecurityContext securityContext = null;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_NAME = "serviceAccountName";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_NAME)
  private String serviceAccountName;

  public static final String SERIALIZED_NAME_SIDECARS = "sidecars";
  @SerializedName(SERIALIZED_NAME_SIDECARS)
  private List<UserContainer> sidecars = null;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<ParallelSteps> steps = null;

  public static final String SERIALIZED_NAME_SUSPEND = "suspend";
  @SerializedName(SERIALIZED_NAME_SUSPEND)
  private SuspendTemplate suspend;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public static final String SERIALIZED_NAME_TEMPLATE_REF = "templateRef";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_REF)
  private TemplateRef templateRef;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";
  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  private List<V1Toleration> tolerations = null;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<V1Volume> volumes = null;


  public Template activeDeadlineSeconds(Long activeDeadlineSeconds) {
    
    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return this;
  }

   /**
   * Optional duration in seconds relative to the StartTime that the pod may be active on a node before the system actively tries to terminate the pod; value must be positive integer This field is only applicable to container and script templates.
   * @return activeDeadlineSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional duration in seconds relative to the StartTime that the pod may be active on a node before the system actively tries to terminate the pod; value must be positive integer This field is only applicable to container and script templates.")

  public Long getActiveDeadlineSeconds() {
    return activeDeadlineSeconds;
  }


  public void setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
  }


  public Template affinity(V1Affinity affinity) {
    
    this.affinity = affinity;
    return this;
  }

   /**
   * Get affinity
   * @return affinity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1Affinity getAffinity() {
    return affinity;
  }


  public void setAffinity(V1Affinity affinity) {
    this.affinity = affinity;
  }


  public Template archiveLocation(ArtifactLocation archiveLocation) {
    
    this.archiveLocation = archiveLocation;
    return this;
  }

   /**
   * Get archiveLocation
   * @return archiveLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ArtifactLocation getArchiveLocation() {
    return archiveLocation;
  }


  public void setArchiveLocation(ArtifactLocation archiveLocation) {
    this.archiveLocation = archiveLocation;
  }


  public Template arguments(Arguments arguments) {
    
    this.arguments = arguments;
    return this;
  }

   /**
   * Get arguments
   * @return arguments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Arguments getArguments() {
    return arguments;
  }


  public void setArguments(Arguments arguments) {
    this.arguments = arguments;
  }


  public Template automountServiceAccountToken(Boolean automountServiceAccountToken) {
    
    this.automountServiceAccountToken = automountServiceAccountToken;
    return this;
  }

   /**
   * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted in pods. ServiceAccountName of ExecutorConfig must be specified if this value is false.
   * @return automountServiceAccountToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AutomountServiceAccountToken indicates whether a service account token should be automatically mounted in pods. ServiceAccountName of ExecutorConfig must be specified if this value is false.")

  public Boolean getAutomountServiceAccountToken() {
    return automountServiceAccountToken;
  }


  public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
  }


  public Template container(V1Container container) {
    
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1Container getContainer() {
    return container;
  }


  public void setContainer(V1Container container) {
    this.container = container;
  }


  public Template daemon(Boolean daemon) {
    
    this.daemon = daemon;
    return this;
  }

   /**
   * Deamon will allow a workflow to proceed to the next step so long as the container reaches readiness
   * @return daemon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deamon will allow a workflow to proceed to the next step so long as the container reaches readiness")

  public Boolean getDaemon() {
    return daemon;
  }


  public void setDaemon(Boolean daemon) {
    this.daemon = daemon;
  }


  public Template dag(DAGTemplate dag) {
    
    this.dag = dag;
    return this;
  }

   /**
   * Get dag
   * @return dag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DAGTemplate getDag() {
    return dag;
  }


  public void setDag(DAGTemplate dag) {
    this.dag = dag;
  }


  public Template executor(ExecutorConfig executor) {
    
    this.executor = executor;
    return this;
  }

   /**
   * Get executor
   * @return executor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExecutorConfig getExecutor() {
    return executor;
  }


  public void setExecutor(ExecutorConfig executor) {
    this.executor = executor;
  }


  public Template hostAliases(List<V1HostAlias> hostAliases) {
    
    this.hostAliases = hostAliases;
    return this;
  }

  public Template addHostAliasesItem(V1HostAlias hostAliasesItem) {
    if (this.hostAliases == null) {
      this.hostAliases = new ArrayList<V1HostAlias>();
    }
    this.hostAliases.add(hostAliasesItem);
    return this;
  }

   /**
   * HostAliases is an optional list of hosts and IPs that will be injected into the pod spec
   * @return hostAliases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HostAliases is an optional list of hosts and IPs that will be injected into the pod spec")

  public List<V1HostAlias> getHostAliases() {
    return hostAliases;
  }


  public void setHostAliases(List<V1HostAlias> hostAliases) {
    this.hostAliases = hostAliases;
  }


  public Template initContainers(List<UserContainer> initContainers) {
    
    this.initContainers = initContainers;
    return this;
  }

  public Template addInitContainersItem(UserContainer initContainersItem) {
    if (this.initContainers == null) {
      this.initContainers = new ArrayList<UserContainer>();
    }
    this.initContainers.add(initContainersItem);
    return this;
  }

   /**
   * InitContainers is a list of containers which run before the main container.
   * @return initContainers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "InitContainers is a list of containers which run before the main container.")

  public List<UserContainer> getInitContainers() {
    return initContainers;
  }


  public void setInitContainers(List<UserContainer> initContainers) {
    this.initContainers = initContainers;
  }


  public Template inputs(Inputs inputs) {
    
    this.inputs = inputs;
    return this;
  }

   /**
   * Get inputs
   * @return inputs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Inputs getInputs() {
    return inputs;
  }


  public void setInputs(Inputs inputs) {
    this.inputs = inputs;
  }


  public Template metadata(Metadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Metadata getMetadata() {
    return metadata;
  }


  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }


  public Template name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name is the name of the template
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is the name of the template")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Template nodeSelector(Map<String, String> nodeSelector) {
    
    this.nodeSelector = nodeSelector;
    return this;
  }

  public Template putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<String, String>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

   /**
   * NodeSelector is a selector to schedule this step of the workflow to be run on the selected node(s). Overrides the selector set at the workflow level.
   * @return nodeSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NodeSelector is a selector to schedule this step of the workflow to be run on the selected node(s). Overrides the selector set at the workflow level.")

  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }


  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }


  public Template outputs(Outputs outputs) {
    
    this.outputs = outputs;
    return this;
  }

   /**
   * Get outputs
   * @return outputs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Outputs getOutputs() {
    return outputs;
  }


  public void setOutputs(Outputs outputs) {
    this.outputs = outputs;
  }


  public Template parallelism(Long parallelism) {
    
    this.parallelism = parallelism;
    return this;
  }

   /**
   * Parallelism limits the max total parallel pods that can execute at the same time within the boundaries of this template invocation. If additional steps/dag templates are invoked, the pods created by those templates will not be counted towards this total.
   * @return parallelism
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parallelism limits the max total parallel pods that can execute at the same time within the boundaries of this template invocation. If additional steps/dag templates are invoked, the pods created by those templates will not be counted towards this total.")

  public Long getParallelism() {
    return parallelism;
  }


  public void setParallelism(Long parallelism) {
    this.parallelism = parallelism;
  }


  public Template podSpecPatch(String podSpecPatch) {
    
    this.podSpecPatch = podSpecPatch;
    return this;
  }

   /**
   * PodSpecPatch holds strategic merge patch to apply against the pod spec. Allows parameterization of container fields which are not strings (e.g. resource limits).
   * @return podSpecPatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PodSpecPatch holds strategic merge patch to apply against the pod spec. Allows parameterization of container fields which are not strings (e.g. resource limits).")

  public String getPodSpecPatch() {
    return podSpecPatch;
  }


  public void setPodSpecPatch(String podSpecPatch) {
    this.podSpecPatch = podSpecPatch;
  }


  public Template priority(Integer priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Priority to apply to workflow pods.
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Priority to apply to workflow pods.")

  public Integer getPriority() {
    return priority;
  }


  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public Template priorityClassName(String priorityClassName) {
    
    this.priorityClassName = priorityClassName;
    return this;
  }

   /**
   * PriorityClassName to apply to workflow pods.
   * @return priorityClassName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PriorityClassName to apply to workflow pods.")

  public String getPriorityClassName() {
    return priorityClassName;
  }


  public void setPriorityClassName(String priorityClassName) {
    this.priorityClassName = priorityClassName;
  }


  public Template resource(ResourceTemplate resource) {
    
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceTemplate getResource() {
    return resource;
  }


  public void setResource(ResourceTemplate resource) {
    this.resource = resource;
  }


  public Template retryStrategy(RetryStrategy retryStrategy) {
    
    this.retryStrategy = retryStrategy;
    return this;
  }

   /**
   * Get retryStrategy
   * @return retryStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RetryStrategy getRetryStrategy() {
    return retryStrategy;
  }


  public void setRetryStrategy(RetryStrategy retryStrategy) {
    this.retryStrategy = retryStrategy;
  }


  public Template schedulerName(String schedulerName) {
    
    this.schedulerName = schedulerName;
    return this;
  }

   /**
   * If specified, the pod will be dispatched by specified scheduler. Or it will be dispatched by workflow scope scheduler if specified. If neither specified, the pod will be dispatched by default scheduler.
   * @return schedulerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, the pod will be dispatched by specified scheduler. Or it will be dispatched by workflow scope scheduler if specified. If neither specified, the pod will be dispatched by default scheduler.")

  public String getSchedulerName() {
    return schedulerName;
  }


  public void setSchedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
  }


  public Template script(ScriptTemplate script) {
    
    this.script = script;
    return this;
  }

   /**
   * Get script
   * @return script
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScriptTemplate getScript() {
    return script;
  }


  public void setScript(ScriptTemplate script) {
    this.script = script;
  }


  public Template securityContext(V1PodSecurityContext securityContext) {
    
    this.securityContext = securityContext;
    return this;
  }

   /**
   * Get securityContext
   * @return securityContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PodSecurityContext getSecurityContext() {
    return securityContext;
  }


  public void setSecurityContext(V1PodSecurityContext securityContext) {
    this.securityContext = securityContext;
  }


  public Template serviceAccountName(String serviceAccountName) {
    
    this.serviceAccountName = serviceAccountName;
    return this;
  }

   /**
   * ServiceAccountName to apply to workflow pods
   * @return serviceAccountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ServiceAccountName to apply to workflow pods")

  public String getServiceAccountName() {
    return serviceAccountName;
  }


  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }


  public Template sidecars(List<UserContainer> sidecars) {
    
    this.sidecars = sidecars;
    return this;
  }

  public Template addSidecarsItem(UserContainer sidecarsItem) {
    if (this.sidecars == null) {
      this.sidecars = new ArrayList<UserContainer>();
    }
    this.sidecars.add(sidecarsItem);
    return this;
  }

   /**
   * Sidecars is a list of containers which run alongside the main container Sidecars are automatically killed when the main container completes
   * @return sidecars
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sidecars is a list of containers which run alongside the main container Sidecars are automatically killed when the main container completes")

  public List<UserContainer> getSidecars() {
    return sidecars;
  }


  public void setSidecars(List<UserContainer> sidecars) {
    this.sidecars = sidecars;
  }


  public Template steps(List<ParallelSteps> steps) {
    
    this.steps = steps;
    return this;
  }

  public Template addStepsItem(ParallelSteps stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<ParallelSteps>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Steps define a series of sequential/parallel workflow steps
   * @return steps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Steps define a series of sequential/parallel workflow steps")

  public List<ParallelSteps> getSteps() {
    return steps;
  }


  public void setSteps(List<ParallelSteps> steps) {
    this.steps = steps;
  }


  public Template suspend(SuspendTemplate suspend) {
    
    this.suspend = suspend;
    return this;
  }

   /**
   * Get suspend
   * @return suspend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SuspendTemplate getSuspend() {
    return suspend;
  }


  public void setSuspend(SuspendTemplate suspend) {
    this.suspend = suspend;
  }


  public Template template(String template) {
    
    this.template = template;
    return this;
  }

   /**
   * Template is the name of the template which is used as the base of this template.
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template is the name of the template which is used as the base of this template.")

  public String getTemplate() {
    return template;
  }


  public void setTemplate(String template) {
    this.template = template;
  }


  public Template templateRef(TemplateRef templateRef) {
    
    this.templateRef = templateRef;
    return this;
  }

   /**
   * Get templateRef
   * @return templateRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TemplateRef getTemplateRef() {
    return templateRef;
  }


  public void setTemplateRef(TemplateRef templateRef) {
    this.templateRef = templateRef;
  }


  public Template tolerations(List<V1Toleration> tolerations) {
    
    this.tolerations = tolerations;
    return this;
  }

  public Template addTolerationsItem(V1Toleration tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<V1Toleration>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

   /**
   * Tolerations to apply to workflow pods.
   * @return tolerations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tolerations to apply to workflow pods.")

  public List<V1Toleration> getTolerations() {
    return tolerations;
  }


  public void setTolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
  }


  public Template volumes(List<V1Volume> volumes) {
    
    this.volumes = volumes;
    return this;
  }

  public Template addVolumesItem(V1Volume volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<V1Volume>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * Volumes is a list of volumes that can be mounted by containers in a template.
   * @return volumes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Volumes is a list of volumes that can be mounted by containers in a template.")

  public List<V1Volume> getVolumes() {
    return volumes;
  }


  public void setVolumes(List<V1Volume> volumes) {
    this.volumes = volumes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Template ioArgoprojWorkflowV1alpha1Template = (Template) o;
    return Objects.equals(this.activeDeadlineSeconds, ioArgoprojWorkflowV1alpha1Template.activeDeadlineSeconds) &&
        Objects.equals(this.affinity, ioArgoprojWorkflowV1alpha1Template.affinity) &&
        Objects.equals(this.archiveLocation, ioArgoprojWorkflowV1alpha1Template.archiveLocation) &&
        Objects.equals(this.arguments, ioArgoprojWorkflowV1alpha1Template.arguments) &&
        Objects.equals(this.automountServiceAccountToken, ioArgoprojWorkflowV1alpha1Template.automountServiceAccountToken) &&
        Objects.equals(this.container, ioArgoprojWorkflowV1alpha1Template.container) &&
        Objects.equals(this.daemon, ioArgoprojWorkflowV1alpha1Template.daemon) &&
        Objects.equals(this.dag, ioArgoprojWorkflowV1alpha1Template.dag) &&
        Objects.equals(this.executor, ioArgoprojWorkflowV1alpha1Template.executor) &&
        Objects.equals(this.hostAliases, ioArgoprojWorkflowV1alpha1Template.hostAliases) &&
        Objects.equals(this.initContainers, ioArgoprojWorkflowV1alpha1Template.initContainers) &&
        Objects.equals(this.inputs, ioArgoprojWorkflowV1alpha1Template.inputs) &&
        Objects.equals(this.metadata, ioArgoprojWorkflowV1alpha1Template.metadata) &&
        Objects.equals(this.name, ioArgoprojWorkflowV1alpha1Template.name) &&
        Objects.equals(this.nodeSelector, ioArgoprojWorkflowV1alpha1Template.nodeSelector) &&
        Objects.equals(this.outputs, ioArgoprojWorkflowV1alpha1Template.outputs) &&
        Objects.equals(this.parallelism, ioArgoprojWorkflowV1alpha1Template.parallelism) &&
        Objects.equals(this.podSpecPatch, ioArgoprojWorkflowV1alpha1Template.podSpecPatch) &&
        Objects.equals(this.priority, ioArgoprojWorkflowV1alpha1Template.priority) &&
        Objects.equals(this.priorityClassName, ioArgoprojWorkflowV1alpha1Template.priorityClassName) &&
        Objects.equals(this.resource, ioArgoprojWorkflowV1alpha1Template.resource) &&
        Objects.equals(this.retryStrategy, ioArgoprojWorkflowV1alpha1Template.retryStrategy) &&
        Objects.equals(this.schedulerName, ioArgoprojWorkflowV1alpha1Template.schedulerName) &&
        Objects.equals(this.script, ioArgoprojWorkflowV1alpha1Template.script) &&
        Objects.equals(this.securityContext, ioArgoprojWorkflowV1alpha1Template.securityContext) &&
        Objects.equals(this.serviceAccountName, ioArgoprojWorkflowV1alpha1Template.serviceAccountName) &&
        Objects.equals(this.sidecars, ioArgoprojWorkflowV1alpha1Template.sidecars) &&
        Objects.equals(this.steps, ioArgoprojWorkflowV1alpha1Template.steps) &&
        Objects.equals(this.suspend, ioArgoprojWorkflowV1alpha1Template.suspend) &&
        Objects.equals(this.template, ioArgoprojWorkflowV1alpha1Template.template) &&
        Objects.equals(this.templateRef, ioArgoprojWorkflowV1alpha1Template.templateRef) &&
        Objects.equals(this.tolerations, ioArgoprojWorkflowV1alpha1Template.tolerations) &&
        Objects.equals(this.volumes, ioArgoprojWorkflowV1alpha1Template.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDeadlineSeconds, affinity, archiveLocation, arguments, automountServiceAccountToken, container, daemon, dag, executor, hostAliases, initContainers, inputs, metadata, name, nodeSelector, outputs, parallelism, podSpecPatch, priority, priorityClassName, resource, retryStrategy, schedulerName, script, securityContext, serviceAccountName, sidecars, steps, suspend, template, templateRef, tolerations, volumes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Template {\n");
    sb.append("    activeDeadlineSeconds: ").append(toIndentedString(activeDeadlineSeconds)).append("\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    archiveLocation: ").append(toIndentedString(archiveLocation)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    automountServiceAccountToken: ").append(toIndentedString(automountServiceAccountToken)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    daemon: ").append(toIndentedString(daemon)).append("\n");
    sb.append("    dag: ").append(toIndentedString(dag)).append("\n");
    sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
    sb.append("    hostAliases: ").append(toIndentedString(hostAliases)).append("\n");
    sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
    sb.append("    podSpecPatch: ").append(toIndentedString(podSpecPatch)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    priorityClassName: ").append(toIndentedString(priorityClassName)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
    sb.append("    schedulerName: ").append(toIndentedString(schedulerName)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    sidecars: ").append(toIndentedString(sidecars)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    templateRef: ").append(toIndentedString(templateRef)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

